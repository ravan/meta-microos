SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-sysvsem-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "354f1429d66c842198ee873580ac05e9f41cd4dff0400a2ea9ff2814e2b78f254ed9eb607a4591d34df40c71e252c7147f7c844ba8dc1d022ec2ed8bd24726cd"

RPROVIDES:${PN} += "config-php8-sysvsem \
php-sysvsem \
php8-sysvsem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
