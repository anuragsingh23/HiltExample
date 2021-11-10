package com.example.hiltexample

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Named

class TestViewMdel @Inject constructor(

    @Named("String2") testString2 : String

) :ViewModel() {

    init {
        Log.d("viewModels","$testString2"
        )
    }
}