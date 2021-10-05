package org.acme;

import java.util.List;

public class Spat {

    public String type;
    public Value value;

    public static class Value{
        public int id;
        public String joke;
        public List<String> categories;

    }

}
