// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    "Median when size=1" {
        median(listOf(5f)) shouldBe 5f
    }
 // Only one value so it has to be equal to it
    "Median when size=2" {
        median(listOf(4f, 8f)) shouldBe (6f plusOrMinus tolerance)
    }
//Its even so its 12/2=6
    "Median when size=3" {
        median(listOf(9f, 2f, 5f)) shouldBe 5f
    }
//odd so you select the middle value from least to greatest
    "Median when size=4" {
        median(listOf(10f, 2f, 8f, 4f)) shouldBe (6f plusOrMinus tolerance)
    }
})
// sorts first then does even formula