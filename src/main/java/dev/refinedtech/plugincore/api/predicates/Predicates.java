package dev.refinedtech.plugincore.api.predicates;

import java.util.function.Predicate;

public abstract class Predicates<T> {

    public static <T> Predicate<T> type(T type) {
        return t -> t.getClass().isAssignableFrom(type.getClass());
    }

    public static <T> Predicate<T> matches(T type) {
        return t -> t.equals(type);
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return t -> !predicate.test(t);
    }

}
