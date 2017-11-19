package com.mobymagic.shazamclone.discover

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mobymagic.shazamclone.R

class DiscoverActivity : AppCompatActivity() {

    private val TAG_FRAGMENT_DISCOVER = "DiscoverFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover)

        val discoverFragment = DiscoverFragment();
        supportFragmentManager.beginTransaction()
                .add(R.id.discoverFragmentContainer, discoverFragment, TAG_FRAGMENT_DISCOVER)
                .commit()
    }

}
