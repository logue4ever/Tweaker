package com.zacharee1.systemuituner.dialogs

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import com.zacharee1.systemuituner.R

class SupportersDialog(val activity: Activity) : ScrolledRoundedBottomSheetDialog(activity) {
    val view: View = LayoutInflater.from(context).inflate(R.layout.supporters_dialog, null)
    init {
        setTitle(R.string.supporters)
        setLayout(view)

        setPositiveButton(android.R.string.ok, null)
    }
}