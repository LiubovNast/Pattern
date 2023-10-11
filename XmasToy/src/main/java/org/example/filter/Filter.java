package org.example.filter;

import org.example.command.ToyCommand;
import org.example.entity.Context;
import org.example.entity.Toy;

public abstract class Filter {

    private Filter nextFilter;
    private Context context;

    abstract void doBefore();

    abstract void doAfter();

    public void execute(Context context, ToyCommand toyCommand) {
        setContext(context);
        doBefore();
        forwardNext(context, toyCommand);
        doAfter();
    }

    private void setContext(Context context) {
        this.context = context;
    }

    void forwardNext(Context context, ToyCommand toyCommand) {
        if (hasNextFilter()) nextFilter.execute(context, toyCommand);
        else toyCommand.execute();
    }

    private boolean hasNextFilter() {
        return nextFilter != null;
    }

    public void nextChain(Filter next) {
        this.nextFilter = next;
    }
    protected Context getContext() {
        return context;
    }
}
