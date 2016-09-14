package edu.mum.cs.cs401.UI;

import edu.mum.cs.cs401.controller.AdminController;
import edu.mum.cs.cs401.model.entity.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by 985333 on 9/13/2016.
 */
public class AdminUI  implements IPersonWindow {

    private static Admin admin = null;
    private Stage adminStage = null;

    public AdminUI() {
        this.adminStage = new Stage();
    }

    void addBook(Book book){
        AdminController.getInstance().addNewBook(book);
    }


    @Override
    public void openPersonWindow(Person perosn)
    {
        admin = (Admin) perosn;
        try
        {
            adminStage.setTitle("Admin Window");

            StackPane root = new StackPane();

            Scene scene = new Scene(root, 600, 200, Color.SILVER);

            GridPane parentGrid= new GridPane();
            parentGrid.setAlignment(Pos.CENTER);
            parentGrid.setHgap(10);
            parentGrid.setVgap(10);
            parentGrid.setPadding(new Insets(0,25,0,25));
            // parentGrid.setGridLinesVisible(true);
            root.getChildren().add(parentGrid);
            adminStage.setScene(scene);
            adminStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
