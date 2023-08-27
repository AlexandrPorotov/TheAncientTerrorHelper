package com.aleksandr.theancientterrorhelper.domain.mapper;

import java.util.List;

public interface BiMapper<S, T> {
    T to(S source);
    S from(T target);
    List<T> to(Iterable<S> sources);
    List<S> from(Iterable<T> targets);
}

