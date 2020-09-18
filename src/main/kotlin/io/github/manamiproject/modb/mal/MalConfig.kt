package io.github.manamiproject.modb.mal

import io.github.manamiproject.modb.core.config.FileSuffix
import io.github.manamiproject.modb.core.config.Hostname
import io.github.manamiproject.modb.core.config.MetaDataProviderConfig

/**
 * Configuration for downloading and converting anime data from myanimelist.net
 * @since 1.0.0
 */
public object MalConfig: MetaDataProviderConfig {

    override fun hostname(): Hostname = "myanimelist.net"

    override fun fileSuffix(): FileSuffix = "html"
}
