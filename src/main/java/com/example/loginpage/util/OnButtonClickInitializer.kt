package com.example.loginpage.util

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Button

class OnButtonClickInitializer(var context : Context) : ClickInitializer{
    override fun initialize(anyId: Int) {
        var activity = context as Activity
        var view = context as View.OnClickListener

        var button = activity.findViewById<Button>(anyId)

        button.setOnClickListener(view)
    }

}