package com.example.test

/**
 * Created by Victor Oliveira on 2019-07-10.
 */

class CallerKotlin {

    fun callerNotFuncationalInterface() {
        MyLibrary.getMyMethod("hehe", object : Callback {
            override fun onSuccess(result: String?) {
                result // use it
            }

            override fun onError(message: String?) {
                message //use it
            }

        })
    }

    fun callerFunctionalInterface() {
        MyLibrary.getMyMethod("haha") {
            if (it.isSuccess) {
                it.subject // use it
            } else {
                it.errorMessage //use it
            }
        }
    }

    fun callerFuncionalInterfaceForEachParameter() {
        MyLibrary.getMyMethod("hihi", {
            //success here
        }) {
            //error here
        }
    }
}