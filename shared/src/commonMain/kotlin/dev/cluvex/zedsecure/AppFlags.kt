package dev.cluvex.zedsecure

/**
 * Fork switch: when false, every UI path that exports, copies or shares
 * server configs (links, QR codes, export-all, raw JSON copy, logs, Vault
 * files) is hidden and the platform share functions do nothing.
 */
object AppFlags {
    const val CONFIG_SHARING_ENABLED: Boolean = false

    /**
     * Telegram channel, donation page, rate-us and update checks.
     * The update check points at the original project's releases, so it stays off in a fork.
     */
    const val ORIGINAL_AUTHOR_LINKS_ENABLED: Boolean = false
}
