package net.gahfy.mvvmposts.injection.component

import android.content.Context
import dagger.Component
import net.gahfy.mvvmposts.injection.module.ApplicationModule
import net.gahfy.mvvmposts.injection.module.NetworkModule
import net.gahfy.mvvmposts.ui.post.PostListActivity
import net.gahfy.mvvmposts.ui.post.PostListViewModel
import net.gahfy.mvvmposts.ui.post.PostViewModel
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class),(ApplicationModule::class)])
interface ViewModelInjector {

/*

    */
/**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     *//*

    fun inject(postListViewModel: PostListViewModel)

    */
/**
     * Injects required dependencies into the specified PostViewModel.
     * @param postViewModel PostViewModel in which to inject the dependencies
     *//*

    fun inject(postViewModel: PostViewModel)
*/

    /**
     * inject requried dependancy into poatListActivity
     */
    fun inject(postListActivity: PostListActivity)


    /*@Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder

      //  fun contextModule(contextModule: ContextModule) : Builder

    }*/
}