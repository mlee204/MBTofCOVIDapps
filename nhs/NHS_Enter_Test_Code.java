// Generated by GraphWalker (http://www.graphwalker.org)
package qub.vg05.nhs;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "qub/vg05/nhs/NHSModel.json")
public interface NHS_Enter_Test_Code {

    @Vertex()
    void v_In_Home_Page_SHARED();

    @Vertex()
    void v_Verify_In_Enter_Test_Code_Page_SHARED();

    @Edge()
    void e_Click_Back_Arrow();

    @Vertex()
    void v_Verify_Invalid_Test_Code();

    @Edge()
    void e_Invalid_Test_Code();
}
