package com.objectstyle.demo.bootique.sample2;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;

public class HelloCommand implements Command {

    @Override
    public CommandOutcome run(Cli cli) {
        System.out.println("Hello, world!");
        return CommandOutcome.succeeded();
    }
}