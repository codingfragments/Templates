package de.appdynamics.ace.groovycli.test.cmd

import com.appdynamics.ace.util.cli.api.api.AbstractCommand
import com.appdynamics.ace.util.cli.api.api.Command
import com.appdynamics.ace.util.cli.api.api.CommandException
import com.appdynamics.ace.util.cli.api.api.OptionWrapper
import org.apache.commons.cli.Option

/**
 * Created by stefan.marx on 25.09.15.
 */
class TestCommand extends AbstractCommand{

    @Override
    protected List<Option> getCLIOptionsImpl() {
        def options = [];
        ["port","host"].each {cmd->
            Option o;
            options +=  o = new Option(cmd,true,cmd);
            o.required = false;
        }

        return options;
    }

    @Override
    protected int executeImpl(OptionWrapper optionWrapper) throws CommandException {
        return 0
    }

    @Override
    String getName() {
        return "NAME"
    }

    @Override
    String getDescription() {
        return "DESC"
    }
}
