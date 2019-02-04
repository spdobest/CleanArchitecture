package spinc.spcleanarchitecture.di.module;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import spinc.spcleanarchitecture.SpApplication;
import spinc.spcleanarchitecture.data.Repository;
import spinc.spcleanarchitecture.data.TeamsRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Module public class MainModule {

  private final SpApplication spApplication;

  public MainModule(SpApplication spApplication) {
    this.spApplication = spApplication;
  }

  @Provides @Singleton Context provideApplicationContext() {
    return spApplication;
  }

  @Provides @Singleton
  Repository provideRepository(TeamsRepository teamsRepository) {
    return teamsRepository;
  }

  @Provides @Named("executor_thread") Scheduler provideExecutorThread() {
    return Schedulers.io();
  }

  @Provides @Named("ui_thread") Scheduler provideUiThread() {
    return AndroidSchedulers.mainThread();
  }
}