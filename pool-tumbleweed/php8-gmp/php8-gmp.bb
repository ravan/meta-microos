SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-gmp-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "e8ddfba4b2afc3c36e646a6528dd5b00e90f5f8bbdbc0091937f8902e7d5f6dcfef60e34146f237402d2bb5b20c5c8eb1881a4188e5553a6e0ea1d4a83f4261f"

RPROVIDES:${PN} += "config-php8-gmp \
php-gmp \
php8-gmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
php"

inherit rpm
