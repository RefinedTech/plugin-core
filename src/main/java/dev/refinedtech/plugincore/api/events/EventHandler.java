package dev.refinedtech.plugincore.api.events;

public interface EventHandler<T> {

    void handle(T event);

}
