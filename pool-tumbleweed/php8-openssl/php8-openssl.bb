SUMMARY = "OpenSSL integration for PHP"
DESCRIPTION = "This extension binds functions of OpenSSL library for symmetric and \
asymmetric encryption and decryption, PBKDF2, PKCS#7, PKCS#12, X.509 \
and other crypto operations. It also provides an implementation of \
TLS streams."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-openssl-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "e3797d4ef0e396cf864ede25bac2d6bcb96e4decb5c59e08d550a6369642ec1b04600dc479c404d79b47d991c11e75adde56d05aa254aa0a1044a5d51a2e8741"

RPROVIDES:${PN} += "config-php8-openssl \
php-openssl \
php8-openssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm
