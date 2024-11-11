package tr.edu.trakya.stateexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StateTestViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name : LiveData<String> = _name

    private val _surName = MutableLiveData<String>()
    val surName : LiveData<String> = _surName

    fun onNameUpdate(newName : String) {
        _name.value=newName
    }

    fun onSurNameUpdate(newSurName : String) {
        _surName.value=newSurName
    }
}