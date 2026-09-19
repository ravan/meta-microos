SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-posix-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "1f065b3ebfe842f7df06b49da1bb1e3f8d9849d703369806d30068e88c55c7dea20995ca117d271f539ed1b12b5c9af1ab853abda8f4860afa4538e021466112"

RPROVIDES:${PN} += "config-php8-posix \
php-posix \
php8-posix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
