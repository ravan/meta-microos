SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-fileinfo-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "2fdb690e870c52fdc3eac351c260d3fe3d685ecab388df21425ed25992a23c31adf7086ccd21c9058b4b989f3e97dff59480327224fe333958510bd6f0806c42"

RPROVIDES:${PN} += "config-php8-fileinfo \
php-fileinfo \
php8-fileinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
