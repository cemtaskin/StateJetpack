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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StateTestScreen(){

    Log.d("StateTextScreen","StateTextScreen")
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        MyText()
        MyTextField()
    }
}

@Composable
fun MyText(){
    Log.d("MyText","MyText")
    Text(text = "Hello")
}

@Composable
fun MyTextField(){
    val name =  remember {
        mutableStateOf("")
    }

    TextField(
        value =name.value,
        onValueChange = {
            name.value= it
        },
        modifier = Modifier.fillMaxWidth()
    )
}