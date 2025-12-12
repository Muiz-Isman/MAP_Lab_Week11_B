package com.example.map_lab_week11_b

import android.net.Uri
import java.io.File

data class FileInfo(
    val uri: Uri,
    val file: File,
    val name: String,
    val relativePath: String,
    val mimeType: String
)