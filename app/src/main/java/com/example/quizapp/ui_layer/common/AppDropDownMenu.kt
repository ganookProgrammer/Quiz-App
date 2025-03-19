package com.example.quizapp.ui_layer.common

import androidx.compose.foundation.background
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizapp.R
import com.example.quizapp.ui_layer.utils.Dimens

@Preview
@Composable
private fun Prev() {
//    val list  = listOf("Item 1", "Item 2")
    
    
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDropDrownMenu(
    menuName : String,
    menuList : List<String>,
//    onDropDownClick : (String) -> Unit
) {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    var selectedText by remember {
        mutableStateOf(menuList[0])
    }

    Column(Modifier.fillMaxWidth()
        .padding(horizontal = Dimens.MediumPadding)) {

        Text(
            text = menuName,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.blue_gray)
        )

        Spacer(Modifier.height(Dimens.SmallSpacerHeight))

        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = {isExpanded = !isExpanded}
        ) { OutlinedTextField(
           modifier =  Modifier.menuAnchor()
                .fillMaxWidth(),
            value = selectedText,
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            textStyle =  TextStyle(color = colorResource(R.color.blue_gray)),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedTrailingIconColor = colorResource(R.color.orange),
                focusedTrailingIconColor = colorResource(R.color.orange),
                focusedBorderColor = colorResource(R.color.dark_slate_blue),
                unfocusedBorderColor = colorResource(R.color.dark_slate_blue),
                containerColor = colorResource(R.color.dark_slate_blue),

            ),
            shape = RoundedCornerShape(Dimens.smallPadding)
        )
            DropdownMenu(
                modifier = Modifier.background(
                    colorResource(R.color.mid_night_blue)
                ),
                expanded = isExpanded,
                onDismissRequest = {isExpanded = false}
            ) {
                menuList.forEachIndexed { index, s ->
                    DropdownMenuItem(
                        text = { Text(text = s , color = colorResource(R.color.blue_gray)) },
                        onClick = {
                            selectedText  = menuList[index]
                            isExpanded = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }
    }

}