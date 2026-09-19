SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-mbstring-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "60452cd09fa0842abfdcd710a8d33f0459528b1c1b6872d36380a891c9307266c18af560f63da36409cc47470e84c242eb9a389a828bcd10e652e3ab1e01076d"

RPROVIDES:${PN} += "config-php8-mbstring \
php-mbstring \
php8-mbstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
php"

inherit rpm
