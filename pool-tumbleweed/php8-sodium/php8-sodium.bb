SUMMARY = "Cryptographic Extension Based on Libsodium"
DESCRIPTION = "PHP binding to libsodium software library for encryption, decryption, \
signatures, password hashing and more."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-sodium-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "ff23734825a47457fd8fe28de9c2b83ad17c0cbe162f3aa6b877f6e42f2bf020968352bf0d6f98ae89e46e7607c14c124d8be863aeebb583c803d22356e81fd3"

RPROVIDES:${PN} += "config-php8-sodium \
php-sodium \
php8-sodium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.26 \
php"

inherit rpm
