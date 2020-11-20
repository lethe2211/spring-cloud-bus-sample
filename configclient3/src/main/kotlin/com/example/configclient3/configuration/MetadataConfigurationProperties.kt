package com.example.configclient3.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration

@RefreshScope
@Configuration
@ConfigurationProperties(value = "config.metadata")
class MetadataConfigurationProperties {
    lateinit var filePath: String
}