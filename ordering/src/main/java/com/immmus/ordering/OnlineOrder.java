package com.immmus.ordering;

import com.immmus.infrastructure.api.domain.Aggregate;
import com.immmus.infrastructure.api.domain.Position;

import java.util.List;

public interface OnlineOrder<P extends Position> extends Aggregate<OnlineOrderEvent> {
    void addPosition(P position);
    void removePosition(P position);
    List<P> viewAddedPositions();

    interface Builder<O extends OnlineOrder> {
        O create();
    }
}