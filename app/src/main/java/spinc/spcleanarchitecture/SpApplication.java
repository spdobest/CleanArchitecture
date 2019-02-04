package spinc.spcleanarchitecture;

import android.app.Application;
import spinc.spcleanarchitecture.di.component.MainComponent;
import spinc.spcleanarchitecture.di.module.MainModule;

public class SpApplication extends Application {
    private MainComponent mainComponent;

    @Override public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        mainComponent = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }
}
