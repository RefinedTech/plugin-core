package dev.refinedtech.plugincore.api.events;

public interface EventBuilder<T, R, P> {

    EventBuilder<T, R, P> execute(EventHandler<T> eventHandler);

    EventBuilder<T, R, P> removeAfter(int amount);

    EventRegister<T, R, P> register(P register);

}
