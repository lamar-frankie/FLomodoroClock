package com.franklamar3d.FLomodoroClock.controllers;

import com.franklamar3d.FLomodoroClock.model.model.Attempt;
import com.franklamar3d.FLomodoroClock.model.model.AttemptKind;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

/**
 * Created by fl76at on 10/17/16.
 */
public class Home {
    @FXML
    private VBox container;

    private Attempt mCurrentAttempt;

    private void prepareAttempt(AttemptKind kind){
        mCurrentAttempt = new Attempt(kind, "");
    }
}
