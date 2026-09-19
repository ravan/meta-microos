SUMMARY = "GD Graphics Library extension for PHP"
DESCRIPTION = "PHP functions to create and manipulate image files in a variety of \
different image formats, including GIF, PNG, JPEG, WBMP, and XPM. Even \
more convenient: PHP can output image streams directly to a browser."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-gd-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "62ff2ec5cb6d7aaaf99cf2949c362bc802e52d2b97e2cc6c137b602e2771175e8d8b667ccae6495f92fc9c9efd11c4b28e45cd30fd06a1afa293419dc7ea62ee"

RPROVIDES:${PN} += "config-php8-gd \
php-gd \
php8-gd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
php"

inherit rpm
