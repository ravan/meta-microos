SUMMARY = "EXIF metadata extensions for PHP"
DESCRIPTION = "PHP functions for extracting EXIF (Exchangable Image File Format; \
metadata from images) information stored in headers of JPEG and TIFF \
images."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-exif-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "1d7e151b88ae4cfd02c4c3583a4eedf5711d3e22cf18bbbb1054ae292ad7caa31f3d0c4c33031429f3cae6d8630a086b283ff3ed7919696cca31dd0632f05fa7"

RPROVIDES:${PN} += "config-php8-exif \
php-exif \
php8-exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php \
php-mbstring"

inherit rpm
