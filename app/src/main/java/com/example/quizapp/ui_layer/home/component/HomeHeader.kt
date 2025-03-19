package com.example.quizapp.ui_layer.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizapp.R
import com.example.quizapp.ui_layer.utils.Dimens
import com.example.quizapp.ui_layer.utils.Dimens.MediumIconSize

//@Preview( heightDp = 150 , widthDp = 300)
@Composable
fun HomeHeader(modifier: Modifier = Modifier) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(Dimens.HomeTopBoxHeight)
            .background(
                color = colorResource(id = R.color.dark_slate_blue),
                shape = RoundedCornerShape(
                    bottomStart = Dimens.ExtraLargeCornerRadius,
                    bottomEnd = Dimens.ExtraLargeCornerRadius
                )
            )
    ) {
        Row(Modifier.fillMaxWidth()
            .padding(top = Dimens.LargePadding),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(R.drawable.menu), contentDescription = "menu",
                modifier = Modifier
                    .weight(1f)
                    .size(MediumIconSize),
                tint = colorResource(id = R.color.blue_gray)
            )

            Text(text = "Quiz App",

                    fontSize = Dimens.LargeTextSize,
                    fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.blue_gray),
                modifier = Modifier.weight(3.5f),
                    textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleMedium

                )

            Icon(painterResource(R.drawable.baseline_account_box_24) , contentDescription = "account_box",
                tint = colorResource(R.color.blue_gray),
                modifier = Modifier.weight(1f)
                    .size(MediumIconSize)
            )
        }
    }


}