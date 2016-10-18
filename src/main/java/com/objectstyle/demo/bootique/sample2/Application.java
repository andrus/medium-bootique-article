package com.objectstyle.demo.bootique.sample2;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.BQCoreModule;
import io.bootique.Bootique;

public class Application implements Module {

    public static void main(String[] args) {
        Bootique.app(args).module(Application.class).run();
    }

    @Override
    public void configure(Binder binder) {

        // BQCoreModule provides access to
        // Guice Multibinder for commands
        BQCoreModule.contributeCommands(binder)
                .addBinding()
                .to(HelloCommand.class);
    }
}