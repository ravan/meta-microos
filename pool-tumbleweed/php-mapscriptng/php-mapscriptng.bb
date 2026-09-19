SUMMARY = "PHP/MapscriptNG map making extensions to PHP"
DESCRIPTION = "The PHP/Mapscript extension provides full map customization capabilities within the PHP scripting language."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "php-mapscriptng-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "492481e9596d81d510079abf114b0a1a2577f366a1ebd7639fb3c445920afc528e4aaac27a88264bfd9eec23fba35c16ecba665392f5e11b8c50ee82eea97b37"

RPROVIDES:${PN} += "config-php-mapscriptng \
php-mapscriptng \
php-mapserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
php \
php-gd"

inherit rpm
