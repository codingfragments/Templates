package de.appdynamics.ace.groovycli.test

import com.appdynamics.ace.util.cli.api.api.Command
import com.appdynamics.ace.util.cli.api.api.CommandException
import com.appdynamics.ace.util.cli.api.api.CommandlineExecution
import com.appdynamics.ace.util.cli.api.api.OptionWrapper
import de.appdynamics.ace.groovycli.test.cmd.CommandWrapper
import de.appdynamics.ace.groovycli.test.cmd.TestCommand
import org.apache.commons.cli.Option

/**
 * Created by stefan.marx on 25.09.15.
 */
class Main {
    public static void main(String[] args) {
        println("READY")   ;
        CommandlineExecution cle = new CommandlineExecution("GroovyCli");
        cle.setHelpVerboseEnabled(false);

        cle.addCommand(new CommandWrapper("test","TEstCommand",
            [host:[desc: 'Hostname to access',opt:true,args:true],
             port:[desc: 'Port to access',opt:true,args:true],
             username:[args:true]
             ],
                {  p->

                    println "TEST"
                    println p;
                    println " --- "
                   // println cli;

                })
        );

        cle.execute(args);
    }
}
