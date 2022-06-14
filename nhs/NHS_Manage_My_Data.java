// Generated by GraphWalker (http://www.graphwalker.org)
package qub.vg05.nhs;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "qub/vg05/nhs/NHSModel.json")
public interface NHS_Manage_My_Data {

    @Edge()
    void e_Click_Delete_All_My_Data();

    @Vertex()
    void v_Verify_Delete_All_Data_Warning_Message();

    @Edge()
    void e_Click_Edit_Button();

    @Edge()
    void e_Click_Cancel();

    @Edge()
    void e_Click_Back_Arrow();

    @Vertex()
    void v_Verify_In_Edit_Postcode_Page_SHARED();

    @Vertex()
    void v_Verify_In_Manage_My_Data_Page_SHARED();
}
