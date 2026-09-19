SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-zlib-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "aaaabdb599dfde3fb05071b9e6f5331ffb4753f01ae7479d144a4d16b4a461ef2fbc0c6f17228e073d14b9d382aef2e76b001769b76915a172840cdee58ae0e0"

RPROVIDES:${PN} += "config-php8-zlib \
php-zlib \
php8-zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php"

inherit rpm
