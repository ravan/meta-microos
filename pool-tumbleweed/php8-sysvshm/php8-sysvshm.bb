SUMMARY = "SysV Shared Memory support for PHP"
DESCRIPTION = "PHP interface for System V shared memory."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-sysvshm-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "00f86276842ab371095f5ed00d09c5dd8d5b446f14e27b13f86dada0b5f8dfd6f1f90f407523ebf9bdde3136b5c9426b1fc6b89a00624f31a97e79424e42c3c0"

RPROVIDES:${PN} += "config-php8-sysvshm \
php-sysvshm \
php8-sysvshm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
