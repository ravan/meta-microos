SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-odbc-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "0f53bba2e9411085eb7b5902b46cce04f679d9a376530514e0666c54d139f6bfae741ff450f9b5507efdfe0d58494a5dd6384652cc530bed39e65d5a07d2b6f3"

RPROVIDES:${PN} += "config-php8-odbc \
php-odbc \
php-pdo-odbc \
php8-odbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libodbc.so.2 \
php \
php-pdo"

inherit rpm
