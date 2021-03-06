package guitests.guihandles;

import static seedu.whatsnext.commons.util.AppUtil.checkArgument;

import guitests.GuiRobot;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;
import seedu.whatsnext.ui.UiManager;

/**
 * A handle for the AlertDialog of the UI
 */
public class AlertDialogHandle extends GuiHandle {


    public AlertDialogHandle(GuiRobot guiRobot, Stage primaryStage, String dialogTitle) {
        super(guiRobot, primaryStage, dialogTitle);
    }

    public boolean isMatching(String headerMessage, String contentMessage) {
        checkArgument(intermediateStage.isPresent(), "Alert dialog is not present");
        DialogPane dialogPane = getNode("#" + UiManager.ALERT_DIALOG_PANE_FIELD_ID);
        boolean isMatching = dialogPane.getHeaderText().equals(headerMessage)
                && dialogPane.getContentText().equals(contentMessage);
        return isMatching;
    }
}
