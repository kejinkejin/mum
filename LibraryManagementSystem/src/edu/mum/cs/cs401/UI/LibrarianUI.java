package edu.mum.cs.cs401.UI;

import edu.mum.cs.cs401.model.entity.Librarian;
import edu.mum.cs.cs401.model.entity.Person;
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
public class LibrarianUI  implements IPersonWindow {
    Librarian librarian = null;
    Stage librarianStage = null;

    public LibrarianUI()
    {
        librarianStage = new Stage();
    }
    @Override
    public void openPersonWindow(Person perosn) {
        librarian = (Librarian) perosn;
        librarianStage.setTitle("Librarian Window");

        StackPane root = new StackPane();

        Scene scene = new Scene(root, 600, 200, Color.WHITE);

        GridPane parentGrid= new GridPane();
        parentGrid.setAlignment(Pos.CENTER);
        parentGrid.setHgap(10);
        parentGrid.setVgap(10);
        parentGrid.setPadding(new Insets(0,25,0,25));
        // parentGrid.setGridLinesVisible(true);
        root.getChildren().add(parentGrid);
        librarianStage.setScene(scene);
        librarianStage.show();
    }


}
