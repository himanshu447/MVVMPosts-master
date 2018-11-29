package net.gahfy.mvvmposts.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import net.gahfy.mvvmposts.injection.ViewModelFactory
import net.gahfy.mvvmposts.model.database.AppDatabase
import net.gahfy.mvvmposts.network.PostApi
import javax.inject.Singleton


@Module
class ApplicationModule internal constructor(private val application: Application) {

    @Provides
    @Singleton
    internal fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    fun provideViewModelFactory(db: AppDatabase, postApi: PostApi) : ViewModelFactory{
        return ViewModelFactory(db, postApi)
    }
}