SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-ftp-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "90dc54da139b19f7513f212477235cb24e2b7367ddc69e37c29c6e880a8ef83611306670996ee286a24f6cec406192b5155fd9dcf5d379cad2a25f31079848a0"

RPROVIDES:${PN} += "config-php8-ftp \
php-ftp \
php8-ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
php"

inherit rpm
