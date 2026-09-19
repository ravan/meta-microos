SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-mysql-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "d4a3c5fa99a3d78de58680a944c579b773a88486b6f0c31bfbb59bf921c2dabe42eed52e1bd12087d601014b49af2b9e9e12321550b0292a180383367b52f863"

RPROVIDES:${PN} += "config-php8-mysql \
php-any-db \
php-mysql \
php-mysqli \
php-pdo-mysql \
php8-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libz.so.1 \
php \
php-pdo"

inherit rpm
