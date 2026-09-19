SUMMARY = "PHP FPM configuration for icingaweb2"
DESCRIPTION = "This package contains the PHP FPM configuration file to run icingaweb2 with php-fpm."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "icingaweb2-php-fpm-2.13.0-1.9.noarch.rpm"
RPM_HASH = "2623c1965b9b0ad7b794c481e5e5a18447658b2526a82e0c2b69decd7e25d2623296bd9c87a577ef4ed67368ce38db4b680361ad352b6f264a9cc8d1f3385c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icingaweb2-php-fpm \
icingaweb2-php-fpm"

RDEPENDS:${PN} += "icingaweb2 \
php8-fpm"

inherit rpm
