package dev.refinedtech.plugincore.api.events;

public interface EventRegister<B, E, P> {

    EventBuilder<B, E, P> register(E event);

}
