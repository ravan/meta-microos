SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-dom-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "78996e0ea17fb0061a1aa1906978e2f6ba9745867128c16502742d171028663091c6847c5f1aacdbe6a1f972517e1c1b219d53af7da9c368069bf5b737b77b98"

RPROVIDES:${PN} += "config-php8-dom \
php-dom \
php8-dom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
php"

inherit rpm
