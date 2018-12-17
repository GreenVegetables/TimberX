package com.naman14.timberx

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.naman14.timberx.util.InjectorUtils

open class NowPlayingFragment : Fragment() {

    lateinit var nowPlayingViewModel: NowPlayingViewModel
    lateinit var mainActivityViewModel: MainViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val context = activity ?: return

        nowPlayingViewModel = ViewModelProviders
                .of(this, InjectorUtils.provideNowPlayingViewModel(context))
                .get(NowPlayingViewModel::class.java)

        mainActivityViewModel = ViewModelProviders
                .of(context, InjectorUtils.provideMainActivityViewModel(context))
                .get(MainViewModel::class.java)
    }
}