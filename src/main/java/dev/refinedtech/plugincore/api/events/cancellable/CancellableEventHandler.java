package dev.refinedtech.plugincore.api.events.cancellable;

public abstract class CancellableEventHandler<T> {

    private boolean cancelled = false;

    abstract void handle(T event);

    public final void cancel() {
        cancelled = true;
    }

    public final boolean isCancelled() {
        return cancelled;
    }
}
