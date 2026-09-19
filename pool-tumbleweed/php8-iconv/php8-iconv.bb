SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-iconv-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "8ccb97b9e8db731a2f58f90a90f089ce4ae8ebc2aa1806b5c647582c566b39c56cbafd117bce7004e8d2745b0553388de0f8c79877680867455c856edb0061e9"

RPROVIDES:${PN} += "config-php8-iconv \
php-iconv \
php8-iconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
