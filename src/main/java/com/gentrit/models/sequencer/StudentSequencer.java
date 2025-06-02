package com.gentrit.models.sequencer;

public class StudentSequencer {
    private static int idSequencer;

    public static int nextId() {
        return ++idSequencer;
    }

    public static int getCurrentId() {
        return idSequencer;
    }

}
