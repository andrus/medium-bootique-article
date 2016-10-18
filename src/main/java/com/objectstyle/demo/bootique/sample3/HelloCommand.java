package com.objectstyle.demo.bootique.sample3;

import com.google.inject.Inject;
import com.google.inject.Provider;
import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import io.bootique.config.ConfigurationFactory;

public class HelloCommand implements Command {

    // injecting configFactory as Guice Provider
    // ensures lazy initialization

    @Inject
    private Provider<ConfigurationFactory> configFactory;

    @Override
    public CommandOutcome run(Cli cli) {

        MyConfig config = configFactory.get()
                .config(MyConfig.class, "my");

        String message = String.format("I was started with (%s, %s)",
                config.getProperty1(),
                config.getProperty2());

        System.out.println(message);
        return CommandOutcome.succeeded();
    }
}