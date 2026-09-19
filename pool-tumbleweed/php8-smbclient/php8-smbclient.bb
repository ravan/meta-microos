SUMMARY = "A PHP wrapper for libsmbclient"
DESCRIPTION = "smbclient is a PHP extension that uses Samba's libsmbclient library to provide \
Samba related functions and 'smb' streams to PHP programs."
LICENSE = "PHP-3.01"

PV = "1.1.2"

RPM_NAME = "php8-smbclient-1.1.2-1.10.aarch64.rpm"
RPM_HASH = "67259e3aa9dd052d80d203fd458eff9ab8de9aadb05be8729a527136aa1e616ca326a42e0b54f8cddf1fb8cd9b4c7c990b409eab64b15b3b0fbdd7a155b4670d"

RPROVIDES:${PN} += "config-php8-smbclient \
php-smbclient \
php8-smbclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
php-api \
php-zend-abi"

inherit rpm
