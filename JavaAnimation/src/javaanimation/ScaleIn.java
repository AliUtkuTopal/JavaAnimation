package javaanimation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


public class ScaleIn extends JavaAnimation implements IAnimTransition {

    public ScaleIn(Node node) {
        super(node);
        animTransition();
    }

    @Override
    public void animTransition() {
        setAnimTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 0, InterpolatorHelper.INT_HELPER),
                        new KeyValue(getNode().scaleXProperty(), 0, InterpolatorHelper.INT_HELPER),
                        new KeyValue(getNode().scaleYProperty(), 0, InterpolatorHelper.INT_HELPER)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 1, InterpolatorHelper.INT_HELPER),
                        new KeyValue(getNode().scaleXProperty(), 1, InterpolatorHelper.INT_HELPER),
                        new KeyValue(getNode().scaleYProperty(), 1, InterpolatorHelper.INT_HELPER)
                )
            )
        );
        getTimeline().play();
    }
}