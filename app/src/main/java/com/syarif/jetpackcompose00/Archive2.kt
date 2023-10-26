package com.syarif.jetpackcompose00

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class Archive2 {
    @Composable
    private fun MyApp(modifier: Modifier = Modifier, names: List<String> = listOf("World", "Compose")) {
        Surface(modifier, color = MaterialTheme.colorScheme.background) {
            Column {
                for (name in names) {
                    Greeting(name = name)
                }
            }
        }
    }

    @Composable
    private fun Greeting(name: String) {
        val expanded = remember {
            mutableStateOf(false)
        }
        val extraPadding = if (expanded.value) 48.dp else 0.dp
        Surface(
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
        ) {
            Row(modifier = Modifier.padding(24.dp)) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = extraPadding)
                ) {
                    Text(text = "Hello,")
                    Text(text = name)
                }
                ElevatedButton(onClick = {
                    expanded.value = !expanded.value
                    Log.d("Kamis Siang", "IsExpanded = $expanded")
                }) {
                    Text(text = if (expanded.value) "Show less" else "Show more")
                }
            }

        }
    }

}