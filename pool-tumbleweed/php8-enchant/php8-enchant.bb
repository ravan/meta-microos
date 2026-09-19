SUMMARY = "Spell checking extension for PHP"
DESCRIPTION = "Enchant is the PHP binding for the Enchant library. Enchant steps in \
to provide uniformity and conformity on top of all spelling \
libraries, and implements certain features that may be lacking in any \
individual provider library. Everything should 'just work' for any \
and every definition of 'just working.'"
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-enchant-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "14cf4dad471104558dc1c99efcf49a52013f5d35784404679e57af461d079147b717cd313cd23834a7947e6b1d4729e645470c0f63b65332fd4144a3d61ba0d7"

RPROVIDES:${PN} += "config-php8-enchant \
php-enchant \
php8-enchant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
php"

inherit rpm
