package it.unibo.workout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WorkoutApp extends Application {
    @Override
    public final void start(final Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/workout.fxml"));
        final Scene scene = new Scene(root, 1000, 800);
        primaryStage.setTitle("App FXML");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static void run(final String[] args) {
        launch(args);
    }

    /**
     * Entry point class.
     */
    public static final class Main {
        private Main() { }

        /**
         * Program's entry point.
         * @param args
         */
        public static void main(final String... args) {
            WorkoutApp.run(args);
        }
    }
}
