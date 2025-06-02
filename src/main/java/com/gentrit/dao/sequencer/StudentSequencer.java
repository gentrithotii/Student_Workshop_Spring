package com.gentrit.dao.sequencer;

public class StudentSequencer {
    private static int idSequencer;

    public static int nextId() {
        return ++idSequencer;
    }

    public static int getCurrentId() {
        return idSequencer;
    }

}
