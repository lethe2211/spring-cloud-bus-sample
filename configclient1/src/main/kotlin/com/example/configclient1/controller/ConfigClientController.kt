package com.example.configclient1.controller

import com.example.configclient1.configuration.MetadataConfigurationProperties
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