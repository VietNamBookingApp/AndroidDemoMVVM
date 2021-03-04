package com.demo.mvvm;

public class ActivityFragmentAnnoationManager {

    public static int check(Object clazz) {
        boolean annotationPresent = clazz.getClass().isAnnotationPresent(ActivityFragmentAnnoation.class);
        if (!annotationPresent){
            throw new IllegalStateException("Activity必须有注解");
        }
        ActivityFragmentAnnoation annotation = clazz.getClass().getAnnotation(ActivityFragmentAnnoation.class);
        return annotation.contentId();
    }
}