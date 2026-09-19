SUMMARY = "PHP UUID support functions"
DESCRIPTION = "This extension provides functions to generate and analyse \
universally unique identifiers (UUIDs)."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "php8-uuid-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "0849234ef2d70a406c98c58b37fbf0072ede1457a746d2b205ca2163b4316ea2253ee41785cfb074ec23f2ebc40a97c5570cd08b6b838bcbc87fd7073158f8bd"

RPROVIDES:${PN} += "config-php8-uuid \
php-uuid \
php8-uuid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1 \
php-api \
php-zend-abi"

inherit rpm
