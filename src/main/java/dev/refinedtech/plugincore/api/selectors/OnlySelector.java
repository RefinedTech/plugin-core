package dev.refinedtech.plugincore.api.selectors;

public interface OnlySelector<T, F> {

    public T only(F filter);
}
