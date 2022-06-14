// Generated by GraphWalker (http://www.graphwalker.org)
package qub.vg05.nhs;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "qub/vg05/nhs/NHSModel.json")
public interface NHS_Settings {

    @Edge()
    void e_Click_Arabic();

    @Edge()
    void e_Click_Punjabi();

    @Edge()
    void e_Click_Romanian();

    @Vertex()
    void v_Verify_In_Settings_Page_SHARED();

    @Edge()
    void e_Click_Welsh();

    @Edge()
    void e_Click_Back_Arrow();

    @Edge()
    void e_Click_System_Level_Language();

    @Edge()
    void e_Click_Gujarati();

    @Edge()
    void e_Click_Somali();

    @Vertex()
    void v_Verify_In_Language_Page();

    @Edge()
    void e_Click_Chinese();

    @Edge()
    void e_Click_Polish();

    @Edge()
    void e_Click_Language();

    @Edge()
    void e_Click_Urdu();

    @Vertex()
    void v_Verify_In_Change_Language_Popup();

    @Edge()
    void e_Click_Cancel();

    @Edge()
    void e_Click_Turkish();

    @Edge()
    void e_Click_Bengali();
}
