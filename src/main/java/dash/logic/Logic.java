package dash.logic;

import java.nio.file.Path;

import dash.commons.core.GuiSettings;
import dash.logic.commands.CommandResult;
import dash.logic.commands.exceptions.CommandException;
import dash.logic.parser.exceptions.ParseException;
import dash.model.Model;
import dash.model.ReadOnlyAddressBook;
import dash.model.person.Person;
import dash.model.task.Task;
import javafx.collections.ObservableList;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     *
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException   If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /**
     * Returns the AddressBook.
     *
     * @see Model#getAddressBook()
     */
    ReadOnlyAddressBook getAddressBook();

    /**
     * Returns an unmodifiable view of the filtered list of persons
     */
    ObservableList<Person> getFilteredPersonList();

    /**
     * Returns an unmodifiable view of the filtered list of tasks
     */
    ObservableList<Task> getFilteredTaskList();

    /**
     * Returns an unmodifiable view of a list of previous valid user inputs.
     */
    ObservableList<String> getObservableUserInputList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Returns the user prefs' task list file path.
     */
    Path getTaskListFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    /**
     * Set the current tab number for parsing commands.
     */
    void setTabNumber(int i);
}
