package com.example.quizapp.ui_layer.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import com.example.quizapp.ui_layer.common.AppDropDrownMenu
import com.example.quizapp.ui_layer.common.ButtonBox
import com.example.quizapp.ui_layer.utils.Constants
import com.example.quizapp.ui_layer.utils.Dimens

@Preview(showBackground = true)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Column(Modifier.fillMaxSize()
        .verticalScroll(rememberScrollState())) {

        HomeHeader()

        Spacer(Modifier.height(Dimens.MediumSpacerHeight))
        AppDropDrownMenu(menuName = "Number of Questions:", menuList = Constants.numbersAsString)

        Spacer(Modifier.height(Dimens.SmallSpacerHeight))
        AppDropDrownMenu(menuName =  "Select Category:" , menuList = Constants.categories)

        Spacer(Modifier.height(Dimens.SmallSpacerHeight))
        AppDropDrownMenu(menuName = "Select Difficulty:", menuList = Constants.diffcultiy)

        Spacer(Modifier.height(Dimens.SmallSpacerHeight))
        AppDropDrownMenu(menuName = "Select Type:", menuList = Constants.type)

        Spacer(Modifier.height(Dimens.MediumSpacerHeight))
        ButtonBox(text = "Generate Quiz" , padding = Dimens.MediumPadding)




    }
    
}