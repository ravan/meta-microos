SUMMARY = "PHP wrapper around the gpgme library"
DESCRIPTION = "This extension provides methods to interact with gnupg."
LICENSE = "BSD-2-Clause"

PV = "1.5.4"

RPM_NAME = "php8-gnupg-1.5.4-1.7.aarch64.rpm"
RPM_HASH = "a2b7d8ab32f882e9fd5355f20239e0d45fe01e800a0c408ba1f08529cf4a5d17d7730a3ada7531ce14cb9776d6545bb37482bfa6d20cb434d05cfb470a4c189a"

RPROVIDES:${PN} += "config-php8-gnupg \
php-gnupg \
php8-gnupg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.45 \
php-api \
php-zend-abi"

inherit rpm
