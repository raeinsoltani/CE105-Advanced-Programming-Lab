module com.example.testflightfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.TicTacToe to javafx.fxml;
    exports com.example.TicTacToe;
}