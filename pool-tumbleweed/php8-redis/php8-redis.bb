SUMMARY = "API for communicating with Redis servers"
DESCRIPTION = "This extension provides an API for communicating with Redis servers"
LICENSE = "PHP-3.01"

PV = "6.3.0"

RPM_NAME = "php8-redis-6.3.0-1.5.aarch64.rpm"
RPM_HASH = "1dc45939dacb7fbb68f150c87a1702c0259567bd51443a30091b1a97201dd319b9a81878e3f27e9b055a113ffd64bed4f89b5c85f5b770f30189bc4c1eaa4a1a"

RPROVIDES:${PN} += "config-php8-redis \
php-redis \
php8-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
