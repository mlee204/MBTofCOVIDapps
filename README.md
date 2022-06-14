VG05-Development of automated test suites to test COVID contact-tracing apps 
---

VG05 is a Java Maven project that uses [GraphWalker](http://graphwalker.github.io) (Model based testing tool) with Appium Framwork to test Covid-19 Android apps

### Prerequisites
1. [Appium](http://appium.io/) is a driver to interact with mobile app.
2. [Android SDK Command-Line Tools](https://developer.android.com/studio/command-line)

To build it, you will need to download and unpack the latest (or recent) version of Maven (https://maven.apache.org/download.cgi)
and put the `mvn` command on your path.
Then, you will need to install a Java 1.8 (or higher) JDK, and make sure you can run `java` from the command line.
Now you can run `mvn clean install` and Maven will compile your project, 
an put the results it in a jar file in the `target` directory.

The SUTs are (tested in Android Version 11):
1. [Protect Scotland](https://play.google.com/store/apps/details?id=gov.scot.covidtracker&hl=en_GB&gl=US)
2. [NHS Covid-19](https://play.google.com/store/apps/details?id=uk.nhs.covid19.production&hl=en_GB&gl=US) 

### Device Setup
Android 11 device required: 
   1. Development options enabled [(Guide)](https://www.howtogeek.com/129728/how-to-access-the-developer-options-menu-and-enable-usb-debugging-on-android-4.2/#:~:text=How%20to%20Access%20the%20Developer,and%20find%20the%20Build%20number.&text=Tap%20the%20Build%20number%20field%20seven%20times%20to%20enable%20Developer%20Options.)  
   2. USB debugging mode turned on when your test device is connected via USB

The test will open the app on the USB connected Android device, and start running the test:

### Test Configuration
The code that implements the abstract test suites is located at:

```
src/test/java/qub/vg05/systemui/protectscotlandmodels/
src/test/java/qub/vg05/systemui/nhsmodels/
```

The `java classes` implements the `java interfaces`. That interfaces are automatically generated by GraphWalker from JSON file (produced by GraphWalker) by running this command:

```
mvn graphwalker:generate-sources
```

Worth noting in the code is the line with GraphWalker annotation (apps separated by group parameter):

```java
//Example of Protect Scotland
@GraphWalker(value = CoverageValue.RandomEdgeCoverage100, groups= "protectScotland")

//Example of NHS Covid-19
@GraphWalker(value = CoverageValue.RandomEdgeCoverage100, groups= "nhs")
```

It does 2 things:

1.  `value = "weighted_random(edge_coverage(100))"`<br>
It sets the generator and the stop condition of the of the path generation of the test. `weighted_random(edge_coverage(100))` means
the the path generator is the random path generator, and the stop condition is when all edges of the graph has been visited.
2. `start = "v_Start"`
Tells GraphWalker where to start the execution. `v_Start` will be the first graph element to be executed.

#### Config file
```
src/main/resources/config.properties
```
Updated test configurations here

### Run MBT test suites

#### via Junit
with GraphWalker WebSocket server to visualise live playback on GraphWalker Studio

NHS Covid-19 MBT test suites

```
//path
src/test/java/qub/vg05/systemui/tests/GraphWalkerNHSCovid19Test.java

   @Test
    public void nhsAppAll() throws IOException {

        Executor executor = new TestExecutor(OnboardingModel.class,
                EnterTestCodeModel.class,
                SelectSymptomsModel.class,
                ManageMyDataModel.class,
                SettingsModel.class,
                qub.vg05.systemui.nhsmodels.AboutThisAppModel.class,
                qub.vg05.systemui.nhsmodels.HomeModel.class,
                RiskAreaModel.class,
                EditPostCodeModel.class,
                VenueCheckInModel.class,
                ReviewSymptomsModel.class,
                BookTestModel.class
        );
        WebSocketServer server = new WebSocketServer(webSocketPortNumber, executor.getMachine());
        server.start();

        setExcel(executor);
        result = executor.execute(true);
        errorControl();

    }

```

Protect Scotland MBT test suites
```
//path
src/test/java/qub/vg05/systemui/tests/GraphWalkerProtectScotlandTest.java

 @Test
    public void protectScotlandAppAll() throws IOException {

        Executor executor = new TestExecutor(ShareAndProtectModel.class,
                HomeModel.class,
                HomeTourModel.class,
                qub.vg05.systemui.protectscotlandmodels.OnboardingModel.class,
                qub.vg05.systemui.protectscotlandmodels.SettingsModel.class,
                AgeConfirmationModel.class,
                LocationConfirmationModel.class,
                AboutThisAppModel.class,
                AddTestCodeModel.class,
                qub.vg05.systemui.protectscotlandmodels.EnterTestCodeModel.class,
                TracingModel.class
        );
        WebSocketServer server = new WebSocketServer(webSocketPortNumber, executor.getMachine());
        server.start();

        setExcel(executor);
        result = executor.execute(true);
        errorControl();

    }
```

#### via Maven
NHS Covid-19 MBT test suites
```
mvn graphwalker:test -Dgroups=nhs  
```

Protect Scotland MBT test suites
```
mvn graphwalker:test -Dgroups=protectScotland  
```