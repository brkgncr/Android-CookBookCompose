package com.burak.cookbookcompose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.burak.cookbookcompose.model.Food
import com.burak.cookbookcompose.ui.theme.CookBookComposeTheme

@Composable
fun FoodList(foods : List<Food>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {

        items(count = 15) { index ->
            Row{
                Text(text = "Item: $index")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FoodListPreview() {
    CookBookComposeTheme {
        FoodList()
    }
}