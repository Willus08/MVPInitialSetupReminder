package posidenpalace.com.mvpinitialsetupreminder.posidenpalace.com.projectname.View.Activites.Inject.MainActivity;

import dagger.Component;
import posidenpalace.com.mvpinitialsetupreminder.posidenpalace.com.projectname.View.Activites.MainActivity.MainActivity;


/**
 * Created by Android on 7/12/2017.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
