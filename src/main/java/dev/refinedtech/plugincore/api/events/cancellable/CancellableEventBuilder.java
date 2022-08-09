package dev.refinedtech.plugincore.api.events.cancellable;

import dev.refinedtech.plugincore.api.events.EventHandler;

import java.util.function.Supplier;

public interface CancellableEventBuilder<T, R, P> {
    CancellableEventBuilder<T, R, P> execute(EventHandler<T> eventHandler);

    CancellableEventBuilder<T, R, P> removeAfter(int amount);

    CancellableEventBuilder<T, R, P> cancelNext(int amount);

    CancellableEventBuilder<T, R, P> cancelAfter(int amount);
    CancellableEventBuilder<T, R, P> cancelIf(Supplier<Boolean> supplier);

    default CancellableEventBuilder<T, R, P> cancelAlways() {
        return this.cancelIf(() -> true);
    }

    CancellableEventRegister<T, R, P> register(P register);

}
