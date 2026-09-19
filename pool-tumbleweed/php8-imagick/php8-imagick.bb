SUMMARY = "Wrapper to the ImageMagick library"
DESCRIPTION = "PHP extension to create, modify and obtain meta information of images using \
the ImageMagick API."
LICENSE = "PHP-3.01"

PV = "3.8.1"

RPM_NAME = "php8-imagick-3.8.1-2.4.aarch64.rpm"
RPM_HASH = "d9d292ce013d60be623feb42b9cead33228d317aea73d8a34091d8b04f4222b38d40a8f8397bc80715c5d876809dad028f3c5cb6bd65e6b8e7a9556549bdc3c4"

RPROVIDES:${PN} += "config-php8-imagick \
php-imagick \
php8-imagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libgomp.so.1 \
php-api \
php-zend-abi"

inherit rpm
