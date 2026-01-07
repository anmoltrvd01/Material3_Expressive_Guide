package com.example.material3expressiveguide.buttons

import android.R.attr.button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.lang.reflect.Modifier

@Composable
fun FabMenu(modifier: androidx.compose.ui.Modifier){
    var expanded by remember {
        mutableStateOf(false) }
    FloatingActionButton(
        expanded = expanded,
        button = {

        }
    ) { }

}