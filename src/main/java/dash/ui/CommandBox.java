package dash.ui;

import dash.logic.Logic;
import dash.logic.commands.CommandResult;
import dash.logic.commands.exceptions.CommandException;
import dash.logic.parser.exceptions.ParseException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Region;

/**
 * The UI component that is responsible for receiving user command inputs.
 */
public class CommandBox extends UiPart<Region> {

    public static final String ERROR_STYLE_CLASS = "error";
    private static final String FXML = "CommandBox.fxml";

    private final CommandExecutor commandExecutor;
    private int currentUserInputIndex = 0;

    @FXML
    private TextField commandTextField;

    /**
     * Creates a {@code CommandBox} with the given {@code CommandExecutor}.
     */
    public CommandBox(CommandExecutor commandExecutor) {
        super(FXML);
        this.commandExecutor = commandExecutor;
        // calls #setStyleToDefault() whenever there is a change to the text of the command box.
        commandTextField.textProperty().addListener((unused1, unused2, unused3) -> setStyleToDefault());

        commandTextField.setOnKeyPressed(event -> handleUpOrDownArrowKeyPressed(event.getCode()));

        /* TODO: Fix this. Currently overrides the above behaviour as well.
        // disables default behaviour of TextField, where up and down arrow keys move caret
        commandTextField.addEventFilter(KeyEvent.ANY, keyEvent -> {
            switch (keyEvent.getCode()) {
            case UP:
                // Fallthrough
            case DOWN:
                keyEvent.consume();
            }
        });
        */
    }

    /**
     * Handles the Enter button pressed event.
     */
    @FXML
    private void handleCommandEntered() {
        String commandText = commandTextField.getText();
        if (commandText.equals("")) {
            return;
        }

        try {
            commandExecutor.execute(commandText);
            commandTextField.setText("");
        } catch (CommandException | ParseException e) {
            setStyleToIndicateCommandFailure();
        }
    }

    /**
     * Handles the Up/Down arrow key pressed event.
     */
    @FXML
    public void handleUpOrDownArrowKeyPressed(KeyCode keyCode) {
        if (keyCode == KeyCode.DOWN && currentUserInputIndex > 0) {
            commandTextField.setText("");
            currentUserInputIndex--;
        }

        if (keyCode == KeyCode.UP && currentUserInputIndex < 9) {
            commandTextField.setText("");
            currentUserInputIndex++;
        }
    }

    /**
     * Sets the command box style to use the default style.
     */
    private void setStyleToDefault() {
        commandTextField.getStyleClass().remove(ERROR_STYLE_CLASS);
    }

    /**
     * Sets the command box style to indicate a failed command.
     */
    private void setStyleToIndicateCommandFailure() {
        ObservableList<String> styleClass = commandTextField.getStyleClass();

        if (styleClass.contains(ERROR_STYLE_CLASS)) {
            return;
        }

        styleClass.add(ERROR_STYLE_CLASS);
    }

    /**
     * Represents a function that can execute commands.
     */
    @FunctionalInterface
    public interface CommandExecutor {
        /**
         * Executes the command and returns the result.
         *
         * @see Logic#execute(String)
         */
        CommandResult execute(String commandText) throws CommandException, ParseException;
    }

}
