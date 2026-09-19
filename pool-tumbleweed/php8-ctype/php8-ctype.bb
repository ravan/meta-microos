SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-ctype-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "8aef8696e8755e848dcd8cd88316390051259a38a5f7a2cbd8c9f8d8f73b4e089ba0eb4838ac446a391a90e42213fc5b6f271931a317c8f7800f4711fe1a451b"

RPROVIDES:${PN} += "config-php8-ctype \
php-ctype \
php8-ctype"

RDEPENDS:${PN} += "libc.so.6 \
php"

inherit rpm
