package tr.edu.trakya.stateexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import tr.edu.trakya.stateexample.component.StateTestScreen
import tr.edu.trakya.stateexample.ui.theme.StateExampleTheme
import tr.edu.trakya.stateexample.viewmodel.StateTestViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = ViewModelProvider(this)[StateTestViewModel::class.java]
            StateTestScreen(viewModel = viewModel)
        }
    }
}

