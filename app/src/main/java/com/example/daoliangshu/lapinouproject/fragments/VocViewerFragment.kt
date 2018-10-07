package com.example.daoliangshu.lapinouproject.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.daoliangshu.lapinouproject.R
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_vocviewer.*

class VocViewerFragment: Fragment() {

    companion object {
        fun newInstance(): VocViewerFragment{
            return VocViewerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_vocviewer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvSourceText.text = "Chanded succesfull"
    }
}