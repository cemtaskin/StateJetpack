package tr.edu.trakya.stateexample.component

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StateTestScreen(){

    val name =  rememberSaveable {
        mutableStateOf("")
    }

    Log.d("StateTextScreen","StateTextScreen")
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        MyText(name.value)
        MyTextField(name.value, onNameChanged = {
            name.value = it
        })
    }
}

@Composable
fun MyText(name:String){
    Log.d("MyText","MyText")
    Text(text = "Hello $name")
}

@Composable
fun MyTextField(name:String,onNameChanged :(String)->Unit){
    TextField(
        value =name,
        onValueChange = {
           onNameChanged(it)
        },
        modifier = Modifier.fillMaxWidth()
    )
}