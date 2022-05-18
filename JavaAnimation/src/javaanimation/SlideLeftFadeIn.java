package javaanimation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


public class SlideLeftFadeIn extends JavaAnimation implements IAnimTransition {
    
    public SlideLeftFadeIn(Node node) {
        super(node);
        animTransition();
    }

    @Override
    public void animTransition() {
        int originalPositionX = 0;
        double animStartPositionX = getNode().getBoundsInParent().getWidth();
        
        setAnimTimeline(new Timeline(
                new KeyFrame(Duration.millis(0),
                        new KeyValue(getNode().opacityProperty(), 0, InterpolatorHelper.INT_HELPER),
                        new KeyValue(getNode().translateXProperty(), animStartPositionX, InterpolatorHelper.INT_HELPER)
                ),
                new KeyFrame(Duration.millis(1000),
                        new KeyValue(getNode().opacityProperty(), 1, InterpolatorHelper.INT_HELPER),
                        new KeyValue(getNode().translateXProperty(), originalPositionX, InterpolatorHelper.INT_HELPER)
                )
            )
        );
        getTimeline().play();
    }
}