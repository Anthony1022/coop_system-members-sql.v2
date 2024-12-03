module dev.niss {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive core.fx;

    requires transitive core.db;
    requires core.util;
    requires javafx.graphics;
    requires java.sql.rowset;
    requires javafx.base;
    requires atlantafx.base;

    opens dev.niss to javafx.fxml;
    opens dev.niss.app to javafx.fxml;

    exports dev.niss;
    exports dev.niss.app;
}