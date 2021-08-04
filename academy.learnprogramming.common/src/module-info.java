module academy.learnprogramming.common {
    requires javafx.base;
    requires java.sql;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    exports academy.learnprogramming.common to javafx.graphics,javafx.fxml, academy.learnprogramming.db, academy.learnprogramming.ui;
    opens academy.learnprogramming.common to javafx.fxml, javafx.base;

}