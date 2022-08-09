package dev.refinedtech.plugincore.api.query;

public abstract class AbstractQueryResult<T> {

    private final T result;

    public AbstractQueryResult(T result) {
        this.result = result;
    }

    public T result() {
        return getResult();
    }

    protected T getResult() {
        return result;
    }

}
