package es.studium.davinciapp.ui.pintor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PintorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PintorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("La última cena");
    }

    public LiveData<String> getText() {
        return mText;
    }
}