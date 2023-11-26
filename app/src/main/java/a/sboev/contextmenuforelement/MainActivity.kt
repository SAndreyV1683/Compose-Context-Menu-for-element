package a.sboev.contextmenuforelement

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
import a.sboev.contextmenuforelement.ui.theme.ContextMenuForElementTheme
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(
                    listOf(
                        "Philip",
                        "Martin",
                        "Carl",
                        "John",
                        "Jake",
                        "Melany",
                        "Melany",
                        "Melany",
                        "Melany",
                        "Melany",
                        "Melany",
                        "Melany",
                        "Melany",
                        "Melany",
                    )
                ) {name ->
                    PersonItem(
                        personName = name,
                        dropDownItems = listOf(
                            DropDownItem("Item1"),
                            DropDownItem("Item1"),
                            DropDownItem("Item1"),
                        ),
                        onItemClick = {
                            Toast.makeText(applicationContext, name, Toast.LENGTH_LONG).show()
                        }
                    )
                }
            }
        }
    }
}

