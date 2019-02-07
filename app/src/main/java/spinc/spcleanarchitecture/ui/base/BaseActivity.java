package spinc.spcleanarchitecture.ui.base;

import android.os.Bundle;

import butterknife.ButterKnife;

public abstract class BaseActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        ButterKnife.bind(this);

    }

    protected abstract int getLayoutId();
}