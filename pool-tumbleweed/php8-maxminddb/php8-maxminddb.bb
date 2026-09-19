SUMMARY = "PHP extension providing access to maxminddb databases"
DESCRIPTION = "This extension provides access to maxminddb databases and is \
a drop-in replacement for MaxMind\\Db\\Reader."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "php8-maxminddb-1.13.1-1.5.aarch64.rpm"
RPM_HASH = "0e6fadf27a08be9ca8f70f39366ac8f9721e8bda956638730551ae97511a2fe7c3690a4995f4713505e96699965904215f40c5a27c789f389e9c2dc21b4e75b9"

RPROVIDES:${PN} += "config-php8-maxminddb \
php-maxminddb \
php8-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
php-api \
php-zend-abi"

inherit rpm
