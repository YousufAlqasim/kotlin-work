// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(
    document: String,
    text: String,
    replacement: Char = 'X'
): String {
    return document.replace(
        text,
        replacement.toString().repeat(text.length)
    )
}