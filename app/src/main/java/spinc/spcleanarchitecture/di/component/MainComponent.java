package spinc.spcleanarchitecture.di.component;

import android.content.Context;
import dagger.Component;
import spinc.spcleanarchitecture.di.module.MainModule;

import javax.inject.Singleton;

@Singleton @Component(modules = MainModule.class) public interface MainComponent {

  void inject(TeamsActivity activity);

  void inject(TeamDetailsActivity activity);

  Context context();
}