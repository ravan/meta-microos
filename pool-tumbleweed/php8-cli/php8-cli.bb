SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the standard implementation of PHP, namely Zend \
PHP. Included are the PHP command-line binary and the configuration \
file (php.ini). \
 \
Additional documentation is available in package php-doc."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-cli-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "6330067c0dcfc8996f0ae3b755c784f20a0c613192c820728bf2a2da75bcf9cd01eff90c88ff9398f3a061e07b6ddf0358433306fa6f4cb3050df57469a1865f"

RPROVIDES:${PN} += "config-php8-cli \
php-cli \
php-sapi \
php8-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
libcapstone.so.5 \
libcrypt.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
liburiparser.so.1 \
libxml2.so.16 \
php"

inherit rpm
