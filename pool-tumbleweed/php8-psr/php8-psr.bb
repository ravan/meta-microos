SUMMARY = "PSR Extension Module"
DESCRIPTION = "This extension provides the accepted PSR interfaces, so they can be used in an extension."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "php8-psr-1.2.0-3.8.aarch64.rpm"
RPM_HASH = "35f46b35fc042bb43b9b365d4d8ec2043704c06ad19cb67d3ccb3a49c9b86c0451b00776ece177f6c3cabfc3ecb00d864bc07e98db97688f3ecd8b9047ba14eb"

RPROVIDES:${PN} += "config-php8-psr \
php8-psr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
