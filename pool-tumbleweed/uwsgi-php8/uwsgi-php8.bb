SUMMARY = "PHP8 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
 \
This package contains support for PHP version 8."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-php8-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "e4c86f7ab3a3d0d3ea80168f4b03de08b8cf3e0587b2a4b677b4b3afe85bd31cb3730fea1383df957ddf1bcb10306cff2af5a0dded740b8bfb6c1da2d77aaf3b"

RPROVIDES:${PN} += "uwsgi-php8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libphp.so \
php8-embed \
uwsgi"

inherit rpm
