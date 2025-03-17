package com.burak.cookbookcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.burak.cookbookcompose.model.Food
import com.burak.cookbookcompose.ui.theme.CookBookComposeTheme

class MainActivity : ComponentActivity() {

    private val foodList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            CookBookComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {

                    }
                }
            }
        }
    }

    private fun createData() {

        val pizza = Food("Pizza","dough, cheese, sausage",R.drawable.pizza)
        val pasta = Food("Pasta","penne, tomatoes, basil",R.drawable.pasta)
        val salad = Food("Salad","minced meat, bread, rice",R.drawable.salad)
        val meatball = Food("Meatball","tomato, cucumber, onion",R.drawable.meatball)
        val bread = Food("Bread","tomato, cucumber, onion",R.drawable.bread)

        foodList.add(pizza)
        foodList.add(pasta)
        foodList.add(salad)
        foodList.add(meatball)
        foodList.add(bread)

    }
}