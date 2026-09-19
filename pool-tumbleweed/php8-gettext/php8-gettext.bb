SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-gettext-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "27b5cdaab1127c97457ffcd9794e8044e181dc274eebab7eea3c4c59754ff5883c818f8b6d5946939f97d49bf967abfd50e04759626137b6cd6b6928b4fb257f"

RPROVIDES:${PN} += "config-php8-gettext \
php-gettext \
php8-gettext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
