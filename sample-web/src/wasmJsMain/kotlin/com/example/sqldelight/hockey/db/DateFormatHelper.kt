package com.example.sqldelight.hockey.db

import kotlinx.datetime.internal.JSJoda.DateTimeFormatter

fun Date.formatted(format: String): String =
  DateTimeFormatter.ofPattern(format).format(this)
