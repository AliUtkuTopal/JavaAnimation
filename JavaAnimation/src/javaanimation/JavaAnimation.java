/*
    JavaAnimation
    Created and coded by Ali Utku Topal

    You can use the JAR version of this project as a library in your JavaFX 
    projects on NetBeans. Compatibility in other programs has not been checked. 

    The example usage of javaanimation is -> new javaanimation.FadeIn(yourObject);
    or
    You can import the animation type then create a new object from it
    such as -> import javaanimation.FadeIn;
    then -> FadeIn fi = new FadeIn(yourObject);

    You can find me on Google Play -> https://play.google.com/store/apps/dev?id=7410159461751310942
    My Github profile -> https://github.com/AliUtkuTopal
*/
package javaanimation;

import javafx.animation.Timeline;
import javafx.scene.Node;


public class JavaAnimation {

    private Timeline timeline;
    
    private Node node;

    
    public JavaAnimation(Node node) {
        this.node = node;
    }
    
    public void setAnimTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public Timeline getTimeline() {
        return timeline;
    }
    
    public Node getNode() {
        return node;
    }

}