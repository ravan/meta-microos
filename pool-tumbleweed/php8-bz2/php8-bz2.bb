SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-bz2-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "9aca8ef649950a10085a8c69449d62f680b623a4943fa896a34ba4d15d34a72ea241676f7737c07a12243dfd9de4df592987d8eac9cd5c2ae60fdff394dd4ad7"

RPROVIDES:${PN} += "config-php8-bz2 \
php-bz2 \
php8-bz2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
php"

inherit rpm
