package javaanimation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


public class FadeOut extends JavaAnimation implements IAnimTransition {
    
    public FadeOut(Node node) {
        super(node);
        animTransition();
    }

    @Override
    public void animTransition() {
        setAnimTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 1, Interpolator.EASE_OUT)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 0, Interpolator.EASE_OUT)
                )
            )
        );
        getTimeline().play();
    }
}