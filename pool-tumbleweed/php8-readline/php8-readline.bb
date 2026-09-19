SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-readline-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "c7b200190d97a72ebeeca9bca62ed2ad7d49db6f097de7afaf8d48c4fc920b367812a9f8843fe37fa45194e71cd0638f0b86966ea2ea6d9c81094140eea1ddb1"

RPROVIDES:${PN} += "config-php8-readline \
php-readline \
php8-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
php"

inherit rpm
