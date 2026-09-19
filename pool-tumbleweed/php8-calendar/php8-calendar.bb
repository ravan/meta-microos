SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-calendar-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "25ce213a854f4b0a26b36e0411bda113df683dec70f1e61c2c28bc5efe5c1a7ee85d7bebb9eee2994ab10ca29399caaf2c3b2f4218f032bb229ddcba81d6dbf2"

RPROVIDES:${PN} += "config-php8-calendar \
php-calendar \
php8-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
