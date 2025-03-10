package com.burak.cookbookcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.burak.cookbookcompose.model.Food
import com.burak.cookbookcompose.ui.theme.CookBookComposeTheme

@Composable
fun DetailScreen(food: Food) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.primaryContainer),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(food.name,
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(5.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
                )

            Image(bitmap = ImageBitmap.imageResource(id = food.image),
                contentDescription = food.name,
                modifier = Modifier.padding(16.dp)
                .size(300.dp,200.dp)
            )

            Text(text = food.ingredients,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                textAlign = TextAlign.Center

            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    CookBookComposeTheme {
        val foodList = arrayListOf<Food>()
        val pizza = Food("Pizza", "dough, cheese, sausage", R.drawable.pizza)
        val pasta = Food("Pasta", "penne, tomatoes, basil", R.drawable.pasta)
        val salad = Food("Salad", "minced meat, bread, rice", R.drawable.salad)
        val meatball = Food("Meatball", "tomato, cucumber, onion", R.drawable.meatball)
        val bread = Food("Bread", "tomato, cucumber, onion", R.drawable.bread)

        DetailScreen(food = bread)
    }
}