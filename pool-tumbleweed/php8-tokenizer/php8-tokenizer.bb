SUMMARY = "Extension module to access Zend Engine's PHP tokenizer"
DESCRIPTION = "The tokenizer functions provide an interface to the PHP tokenizer \
embedded in the Zend Engine. Using these functions you may write your \
own PHP source analyzing or modification tools without having to deal \
with the language specification at the lexical level."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-tokenizer-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "04837e8c6981627fa16a2b780f5c06476758f6a5500adeb0589ec3fd938baae00b1c8c5eaadc8a6a55d80db9dd04a15f588b3f00d02c45a490cd4b8d99b91b83"

RPROVIDES:${PN} += "config-php8-tokenizer \
php-tokenizer \
php8-tokenizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
