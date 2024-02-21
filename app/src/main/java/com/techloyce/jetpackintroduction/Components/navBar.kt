package com.techloyce.jetpackintroduction.Components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.techloyce.jetpackintroduction.navItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navBar(){
    val item= listOf(
        navItem(title="Home",
            selectedIcon = Icons.Filled.Home,
            unSelectedIcon = Icons.Outlined.Home,
            hasNews = false),
        navItem(title="Chat",
            selectedIcon = Icons.Filled.Email,
            unSelectedIcon = Icons.Outlined.Email,
            hasNews = false),
        navItem(title="Setting",
            selectedIcon = Icons.Filled.Settings,
            unSelectedIcon = Icons.Outlined.Settings,
            hasNews = false)
    )
    var selectedItemIndex by rememberSaveable{
        mutableStateOf(-1)
    }
    Scaffold(
        bottomBar = {
            NavigationBar {
                item.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedItemIndex==index,
                        onClick = {
                            selectedItemIndex=index
                        },
                        label={
                            Text(text = navItem.title)
                        },
                        icon = {
                            Icon(
                                imageVector = if (selectedItemIndex==index){
                                    navItem.selectedIcon
                                }
                                else{
                                    navItem.unSelectedIcon
                                },
                                contentDescription = navItem.title)

                        })
                }

            }
        }
    ) {

    }


}