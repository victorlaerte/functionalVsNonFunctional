package com.example.test;

/**
 * Created by Victor Oliveira on 2019-07-10.
 */
interface Callback {
    void onSuccess(String result);
    void onError(String message);
}
