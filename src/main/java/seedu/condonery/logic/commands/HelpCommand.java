package seedu.condonery.logic.commands;

import seedu.condonery.model.Model;

/**
 * Format full help instructions for every command for display.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n";

    public static final String SHOWING_HELP_MESSAGE = "Opened help window.\n"
        + "add: "+ "Add a contact.\n"
        + "delete: "+ "Delete a contact.\n" 
        + "edit "+ "Edit a contact.\n" 
        + "list "+ "List all contacts.\n" 
        + "find "+ "Find a person by name.\n" 
        + "exit "+ "Exit addressbook.\n"   ;


    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false);
    }
}
