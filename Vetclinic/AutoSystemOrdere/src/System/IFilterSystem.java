package System;

import Filter.Filter;

import java.util.ArrayList;

public interface IFilterSystem {
    public ArrayList<String> paramRequest(Filter filter, String request);
}

