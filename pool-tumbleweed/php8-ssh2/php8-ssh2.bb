SUMMARY = "PHP bindings for the libssh2 library"
DESCRIPTION = "This package provides PHP bindings for the libssh2 library"
LICENSE = "PHP-3.01"

PV = "1.5.0"

RPM_NAME = "php8-ssh2-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "f91aee129f17873838f451e98b6d79882f54f042c9c689fd48218a3653a4718382ad57d83d0ac72b041d582e98f32bb65d022643e60c19916f4d8b811d656837"

RPROVIDES:${PN} += "config-php8-ssh2 \
php-ssh2 \
php8-ssh2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh2.so.1 \
php-api \
php-zend-abi"

inherit rpm
