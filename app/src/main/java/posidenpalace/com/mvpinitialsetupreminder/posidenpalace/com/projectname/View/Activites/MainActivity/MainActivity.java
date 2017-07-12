package posidenpalace.com.mvpinitialsetupreminder.posidenpalace.com.projectname.View.Activites.MainActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import posidenpalace.com.mvpinitialsetupreminder.R;
import posidenpalace.com.mvpinitialsetupreminder.posidenpalace.com.projectname.View.Activites.Inject.MainActivity.DaggerMainActivityComponent;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    // cadd these to library
//    compile 'com.google.dagger:dagger:2.9'
//    annotationProcessor 'com.google.dagger:dagger-compiler:2.9'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // set up variables like textViews etc
        setUpDaggerComponent();
        //presenter.whatever
    }

    private void setUpDaggerComponent(){
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String error) {

    }
}
