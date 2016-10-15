package com.teamtreehouse.pomodoro.model;

/**
 * Created by fl76at on 10/14/16.
 */
public enum AttemptKind {
    FOCUS(25 * 60),
    BREAK(5 * 60);

    private int mTotalSeconds;

    AttemptKind(int totalSeconds) {
        mTotalSeconds = totalSeconds;
    }


    public int getTotalSeconds() {
        return mTotalSeconds;
    }
}
