SUMMARY = "PHP Memcache client Extension"
DESCRIPTION = "Memcached is a caching daemon designed especially for \
dynamic web applications to decrease database load by \
storing objects in memory. \
This extension allows you to work with memcached through \
handy OO and procedural interfaces. \
The extension allows use to store sessions in memcached \
via memcache."
LICENSE = "PHP-3.0"

PV = "8.2"

RPM_NAME = "php8-memcache-8.2-3.6.aarch64.rpm"
RPM_HASH = "1d0fcbecc523ff18b4b792a6532f65ecd398c2bc9ba7fcda1cd388339fec9c69c770965e61d6ba60694128829252c5fbfda9d25b93c72d24d155985215e080c1"

RPROVIDES:${PN} += "config-php8-memcache \
php8-memcache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
php-api \
php-zend-abi"

inherit rpm
