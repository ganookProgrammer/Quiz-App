package com.example.quizapp.ui_layer.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.quizapp.R
import com.example.quizapp.ui_layer.utils.Dimens

//@Preview
@Composable
private fun Prev() {
    ButtonBox("Generate Quiz",15.dp)
}

@Composable
fun ButtonBox(
    text: String,
    padding: Dp
) {

    Box(Modifier.padding(padding)
        .fillMaxWidth()
        .height(Dimens.MediumBoxHeight)
        .clip(RoundedCornerShape(Dimens.LargeCornerRadius))
        .background(colorResource(R.color.blue_gray)),
        contentAlignment = Alignment.Center){

        Text(text = text,
            fontSize = Dimens.MediumTextSize,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold))
    }

}