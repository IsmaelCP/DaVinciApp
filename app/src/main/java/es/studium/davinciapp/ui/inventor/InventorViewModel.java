package es.studium.davinciapp.ui.inventor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InventorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Tornillo aéreo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}