SUMMARY = "SysV Message Queue support for PHP"
DESCRIPTION = "This module provides System V Message Queue support."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-sysvmsg-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "7479fd90e19cd453fc28a17b2db18f09d11d1d753930bebbb892a1958cfd9c69c5c22087ff8eafcaaab1540c1f202648cda2b9d4a15c3974faf57b2dae24e794"

RPROVIDES:${PN} += "config-php8-sysvmsg \
php-sysvmsg \
php8-sysvmsg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
