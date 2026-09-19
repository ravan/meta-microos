SUMMARY = "PHP MemcacheD client Extension"
DESCRIPTION = "This extension uses libmemcached library to provide API for \
communicating with memcached servers."
LICENSE = "PHP-3.01"

PV = "3.4.0"

RPM_NAME = "php8-memcached-3.4.0-1.5.aarch64.rpm"
RPM_HASH = "f97d64f46a027f5f4c757cdfab7ed139e8c7b11f57f648fae2069d06774836469250eb6a7f7ab9cfe8e777d903b2a79f4020a28e9175d9537875201d545d877b"

RPROVIDES:${PN} += "config-php8-memcached \
php8-memcached"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastlz.so.1 \
libmemcached.so.11 \
libsasl2.so.3 \
libz.so.1 \
php-api \
php-zend-abi"

inherit rpm
