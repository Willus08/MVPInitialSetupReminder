package posidenpalace.com.mvpinitialsetupreminder.posidenpalace.com.projectname.View.Activites.Inject.MainActivity;

import dagger.Module;
import dagger.Provides;
import posidenpalace.com.mvpinitialsetupreminder.posidenpalace.com.projectname.View.Activites.MainActivity.MainActivityPresentor;


/**
 * Created by Android on 7/12/2017.
 */
@Module
public class MainActivityModule {
    @Provides
    public MainActivityPresentor provideMainActivityPresentor(){
        return  new MainActivityPresentor();
    }
}
