SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-curl-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "fb2d8efa3ed64e19e2943925b9afa7fdc6ac88c752d8fa62e23e2bd2bd02348400f7a0bf208d71a2570522f6e4c894a260e6e6fd90506b0a2e2dbdb4ace30106"

RPROVIDES:${PN} += "config-php8-curl \
php-curl \
php8-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
php"

inherit rpm
