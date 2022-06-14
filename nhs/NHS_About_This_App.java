// Generated by GraphWalker (http://www.graphwalker.org)
package qub.vg05.nhs;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "qub/vg05/nhs/NHSModel.json")
public interface NHS_About_This_App {

    @Edge()
    void e_Click_Terms_Of_Use();

    @Edge()
    void e_Click_Privacy_Notice();

    @Vertex()
    void v_Verify_In_About_This_App_Page_SHARED();

    @Edge()
    void e_Click_Manage_My_Data();

    @Edge()
    void e_Click_Close_Chrome();

    @Edge()
    void e_Click_Accessibility_Statement();

    @Edge()
    void e_Click_Common_Questions();

    @Edge()
    void e_Click_Feedback_Information();

    @Vertex()
    void v_Verify_Chrome_Web_View();

    @Edge()
    void e_Click_Back_Arrow();

    @Vertex()
    void v_Verify_In_Manage_My_Data_Page_SHARED();

    @Edge()
    void e_Click_How_App_Works();
}
