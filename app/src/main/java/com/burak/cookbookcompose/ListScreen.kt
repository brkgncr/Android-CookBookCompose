package com.burak.cookbookcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.burak.cookbookcompose.model.Food
import com.burak.cookbookcompose.ui.theme.CookBookComposeTheme

@Composable
fun FoodList(foods : List<Food>) {
    LazyColumn(contentPadding = PaddingValues(5.dp),
        modifier = Modifier.fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary)
    ) {
        items(foods) {
            FoodRow(food = it)
        }
    }
}

@Composable
fun FoodRow(food: Food) {
    Column(modifier = Modifier.fillMaxWidth()
        .background(color = MaterialTheme.colorScheme.background)
        .clickable {
            // navigation
        }
    ) {
        Text(text = food.name,
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier.padding(5.dp),
            fontWeight = FontWeight.Bold
            )

        Text(text = food.ingredients,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(5.dp),
            fontWeight = FontWeight.Normal
            )
    }
}

/*
@Preview(showBackground = true)
@Composable
fun FoodListPreview() {
    CookBookComposeTheme {
        val foodList = arrayListOf<Food>()
        val pizza = Food("Pizza", "dough, cheese, sausage", R.drawable.pizza)
        val pasta = Food("Pasta", "penne, tomatoes, basil", R.drawable.pasta)
        val salad = Food("Salad", "minced meat, bread, rice", R.drawable.salad)
        val meatball = Food("Meatball", "tomato, cucumber, onion", R.drawable.meatball)
        val bread = Food("Bread", "tomato, cucumber, onion", R.drawable.bread)

        foodList.add(pizza)
        foodList.add(pasta)
        foodList.add(salad)
        foodList.add(meatball)
        foodList.add(bread)
        foodList.add(pizza)
        foodList.add(pasta)
        foodList.add(salad)
        foodList.add(meatball)
        foodList.add(bread)

        FoodList(foodList)
    }
}
*/