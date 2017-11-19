package com.mobymagic.shazamclone.discover

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.mobymagic.shazamclone.R
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Tests for the notes screen, the main screen which contains a grid of all notes.
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class DiscoverActivityTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule<DiscoverActivity>(DiscoverActivity::class.java)

    @Test
    fun checkFragmentShown() {
        onView(withId(R.id.discoverStartStopButton)).check(matches(isDisplayed()))
    }

}