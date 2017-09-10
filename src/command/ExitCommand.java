package command;

import CH.ConsoleHelper;

/**
 * Created by Александр on 10.09.2017.
 */
public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
