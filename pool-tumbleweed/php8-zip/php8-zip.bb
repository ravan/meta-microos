SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-zip-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "cb6b9426bb9e36b50d643e8b47fe3e48ab4b332fb21da19f9a4d8df1f8149fbdefc6a7953697f94b6647030f48856f2973108bcb470c455240b518b72f398a8e"

RPROVIDES:${PN} += "config-php8-zip \
php-zip \
php8-zip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzip.so.5 \
php"

inherit rpm
