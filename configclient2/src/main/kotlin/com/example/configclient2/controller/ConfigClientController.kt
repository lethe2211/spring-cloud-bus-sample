package com.example.configclient2.controller

import com.example.configclient2.configuration.MetadataConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigClientController(
    private val metadataConfigurationProperties: MetadataConfigurationProperties
) {
    @GetMapping("/filepath")
    fun getFilePath(): String {
        return metadataConfigurationProperties.filePath
    }
}