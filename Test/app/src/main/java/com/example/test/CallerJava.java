package com.example.test;

/**
 * Created by Victor Oliveira on 2019-07-10.
 */
public class CallerJava {

    public void callerJavaNotFunciontional() {
        MyLibrary.getMyMethod("hehe", new Callback() {
            @Override
            public void onSuccess(String result) {
                //use it
            }

            @Override
            public void onError(String message) {
                //use it
            }
        });
    }

    public void callerJava8WrapperFunctional() {
        MyLibrary.getMyMethod("haha", result -> {
            // use it
        });
    }

    public void callerJava8FunctionalForEachParameter() {
        MyLibrary.getMyMethod("hihi", success -> {
            //success here
        }, errorMessage -> {
            //error here
        });
    }
}
