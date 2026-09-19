SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-sockets-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "8fe2d5e5c76832060044471fe9bf549f7ca8847b1c7e635ee5d81dd05c0246ffb608fe62dccbf5888bd04b836a33ebd499941a00472657a91a64e07c292a05a2"

RPROVIDES:${PN} += "config-php8-sockets \
php-sockets \
php8-sockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
