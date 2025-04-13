module easv.dk.belman {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens easv.dk.belman to javafx.fxml;
    exports easv.dk.belman;
}