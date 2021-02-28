package calculator.util.extension

import calculator.util.Message.Companion.NOTICE_NOT_BLANK
import calculator.util.Message.Companion.NOTICE_NOT_NULL
import calculator.util.Message.Companion.NOTICE_NOT_OPERAND_SYMBOL

fun String.splitNotBlank(delimiter: String): List<String> {
    require(isNotBlank()) { NOTICE_NOT_BLANK }
    return split(delimiter)
}

fun String?.splitToCalculate(delimiter: String): List<String> {
    if (this?.length ?: 0 < 2) this?.toDouble(NOTICE_NOT_OPERAND_SYMBOL)
    return requireNotNull(this?.splitNotBlank(delimiter), { NOTICE_NOT_NULL })
}

fun String.toDouble(message: String): Double {
    return requireNotNull(toDoubleOrNull(), { plus(message) })
}
