SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-pgsql-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "5d698b6a4c9e99fef2b5edb303da5434e9bf54b44519bd7af78aa91a76e932f0cf5047dcf6ef23b0ffa9be831f8c59c8f0de2fb2fdd6507359637626f5ac8bcb"

RPROVIDES:${PN} += "config-php8-pgsql \
php-any-db \
php-pdo-pgsql \
php-pgsql \
php8-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
php \
php-pdo"

inherit rpm
