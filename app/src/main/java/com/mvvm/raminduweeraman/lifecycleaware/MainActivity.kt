package com.mvvm.raminduweeraman.lifecycleaware

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.content.DialogInterface
class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowWithLifeCycleAware.setOnClickListener {
            showDialogWithLifeCycleAware()
        }

        btnShowWithoutLifeCycleAware.setOnClickListener {
            showDialogWithoutLifeCycleAware()
        }
    }

    private fun showDialogWithLifeCycleAware() {
        Log.d(TAG, "showDialogWithLifeCycleAware")
        val builder = AlertDialog.Builder(this).create()
        builder.setTitle("Android Alert")
        builder.setMessage("We have a message")
        builder.setButton(DialogInterface.BUTTON_POSITIVE, "OK", DialogInterface.OnClickListener { dialog, which ->

        })

        builder.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", DialogInterface.OnClickListener { dialog, which ->

        })
        builder.show()

        lifecycle.addObserver(EventObserver(builder))
    }

    private fun showDialogWithoutLifeCycleAware() {
        Log.d(TAG, "showDialogWithoutLifeCycleAware")
        val builder = AlertDialog.Builder(this).create()
        builder.setTitle("Android Alert")
        builder.setMessage("We have a message")
        builder.setButton(DialogInterface.BUTTON_POSITIVE, "OK", DialogInterface.OnClickListener { dialog, which ->

        })

        builder.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", DialogInterface.OnClickListener { dialog, which ->

        })
        builder.show()

    }
}


/*

https://kinnrot.github.io/android-lifecycle-aware-modal/
http://thetechnocafe.com/understanding-lifecycle-in-android-architecture-components/

*/
