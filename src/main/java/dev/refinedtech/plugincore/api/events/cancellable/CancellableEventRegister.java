package dev.refinedtech.plugincore.api.events.cancellable;

public interface CancellableEventRegister<B, E, P> {

    CancellableEventBuilder<B, E, P> register(E event);

}
