package net.gahfy.mvvmposts.base

import android.app.Application
import net.gahfy.mvvmposts.injection.component.DaggerViewModelInjector
import net.gahfy.mvvmposts.injection.component.ViewModelInjector
import net.gahfy.mvvmposts.injection.module.ApplicationModule
import net.gahfy.mvvmposts.injection.module.NetworkModule


class MyApplication : Application() {

    lateinit var component: ViewModelInjector

    override fun onCreate() {
        super.onCreate()

        component = DaggerViewModelInjector.builder()
                .applicationModule(ApplicationModule(this))
                .networkModule(NetworkModule)
                .build()

    }


}
