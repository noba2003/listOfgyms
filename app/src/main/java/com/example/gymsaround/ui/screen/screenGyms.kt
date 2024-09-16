package com.example.gymsaround.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.gymsaround.model.Gym

@Composable
fun CardGyms(navController: NavHostController) {
    var viewModel= viewmodel()

    LazyColumn {
        items(viewModel.state){Gym ->

            GymItem(Gym,{viewModel.toggleFavorite(Gym.id)},{
                navController.navigate("details/${Gym.id}")
            })

        }
    }

}



 @Composable
fun GymItem(gym: Gym,clickAction:(Int)->Unit,clickCard:(Int)->Unit) {

    val icon = if (gym.isFavorite) {
        Icons.Filled.Favorite
    } else {
        Icons.Filled.FavoriteBorder
    }
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,){
        Card(
            modifier = Modifier.height(100.dp),
            onClick = { clickCard(gym.id)}, elevation = CardDefaults.cardElevation(
                focusedElevation = 4.dp, defaultElevation = 1.dp, pressedElevation = 1.dp
                , hoveredElevation = 5.dp
            ), colors = CardDefaults.cardColors(

            )
        ) {
            Row(modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                GymIcon(Icons.Filled.Place, Modifier.weight(0.15f))
                GmyDetails(gym,Modifier.weight(0.70f))

                GymIcon(icon, Modifier.weight(0.15f)){clickAction(gym.id)}

            }
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}

private @Composable
fun GmyDetails(gyms: Gym,modifier: Modifier) {

    Column(modifier = modifier) {
        Text(text = gyms.name, style = MaterialTheme.typography.headlineSmall, color = Color.Black)

        Text(text = gyms.address, style = MaterialTheme.typography.bodyMedium)

    }
}


private @Composable
fun GymIcon(place: ImageVector, modifier: Modifier,clickAction:()->Unit={}) {
    Image(modifier = modifier.clickable { clickAction() },
        imageVector = place,
        contentDescription = null,
        colorFilter = ColorFilter.tint(
            Color.Blue
        )
    )
}