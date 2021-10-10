package seedu.address.logic.parser.personcommand;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import java.util.Arrays;

import seedu.address.logic.commands.personcommand.FindPersonCommand;
import seedu.address.logic.commands.personcommand.FindPersonCommand.FindPersonDescriptor;
import seedu.address.logic.parser.ArgumentMultimap;
import seedu.address.logic.parser.ArgumentTokenizer;
import seedu.address.logic.parser.Parser;
import seedu.address.logic.parser.exceptions.ParseException;


/**
 * Parses input arguments and creates a new FindCommand object
 */
public class FindPersonCommandParser implements Parser<FindPersonCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FindCommand
     * and returns a FindCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FindPersonCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_NAME, PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS, PREFIX_TAG);
        String preamble = argMultimap.getPreamble();

        FindPersonDescriptor findPersonDescriptor = new FindPersonDescriptor();
        boolean namePresent = argMultimap.getValue(PREFIX_NAME).isPresent();
        boolean phonePresent = argMultimap.getValue(PREFIX_PHONE).isPresent();
        boolean emailPresent = argMultimap.getValue(PREFIX_EMAIL).isPresent();
        boolean addressPresent = argMultimap.getValue(PREFIX_ADDRESS).isPresent();
        boolean tagPresent = argMultimap.getValue(PREFIX_TAG).isPresent();
        if (preamble.isEmpty() && !namePresent && !phonePresent && !emailPresent && !addressPresent && !tagPresent) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, FindPersonCommand.MESSAGE_USAGE));
        } else if (!preamble.isEmpty()) {
            String[] preambleKeywords = preamble.split("\\s+");
            findPersonDescriptor.setName(Arrays.asList(preambleKeywords));
        }
        //if both preamble and name prefix specified, name prefix will override
        if (namePresent) {
            if (argMultimap.getValue(PREFIX_NAME).get().isEmpty()) {
                throw new ParseException("Arguments cannot be empty");
            }
            String[] nameKeywords = argMultimap.getValue(PREFIX_NAME).get().split("\\s+");
            findPersonDescriptor.setName(Arrays.asList(nameKeywords));
        }
        if (phonePresent) {
            if (argMultimap.getValue(PREFIX_PHONE).get().isEmpty()) {
                throw new ParseException("Arguments cannot be empty");
            }
            String[] phoneKeywords = argMultimap.getValue(PREFIX_PHONE).get().split("\\s+");
            findPersonDescriptor.setPhone(Arrays.asList(phoneKeywords));
        }
        if (emailPresent) {
            if (argMultimap.getValue(PREFIX_EMAIL).get().isEmpty()) {
                throw new ParseException("Arguments cannot be empty");
            }
            String[] emailKeywords = argMultimap.getValue(PREFIX_EMAIL).get().split("\\s+");
            findPersonDescriptor.setEmail(Arrays.asList(emailKeywords));
        }
        if (addressPresent) {
            if (argMultimap.getValue(PREFIX_ADDRESS).get().isEmpty()) {
                throw new ParseException("Arguments cannot be empty");
            }
            String[] addressKeywords = argMultimap.getValue(PREFIX_ADDRESS).get().split("\\s+");
            findPersonDescriptor.setAddress(Arrays.asList(addressKeywords));
        }
        if (tagPresent) {
            if (argMultimap.getValue(PREFIX_TAG).get().isEmpty()) {
                throw new ParseException("Arguments cannot be empty");
            }
            String[] tagKeywords = argMultimap.getValue(PREFIX_TAG).get().split("\\s+");
            findPersonDescriptor.setTags(Arrays.asList(tagKeywords));
        }

        return new FindPersonCommand(findPersonDescriptor);

    }

}
