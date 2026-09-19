SUMMARY = "PHP framework delivered as C extension"
DESCRIPTION = "ICE is a PHP framework delivered as C extension. You do not need \
learn or use the C language, since the functionality is exposed as \
PHP classes."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "php8-ice-1.11.0-2.5.aarch64.rpm"
RPM_HASH = "9302c989a28591adfcc778855daf3f4e4f81b48c0bc24ba990f195f0e1686f870104c60fbdb4aa83fe25a530470c4d7e726b0eea57c049c7f9fc91dd861b30a8"

RPROVIDES:${PN} += "config-php8-ice \
php8-ice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
