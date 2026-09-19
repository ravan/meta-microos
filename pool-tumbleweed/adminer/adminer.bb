SUMMARY = "Database management in a single PHP file"
DESCRIPTION = "Adminer (formerly phpMinAdmin) is a full-featured database management tool \
written in PHP. Conversely to phpMyAdmin, it consists of a single file ready to \
deploy to the target server. Adminer is available for MySQL, PostgreSQL, SQLite, \
MS SQL, Oracle, Firebird, SimpleDB, Elasticsearch and MongoDB."
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-4.8.1-1.13.noarch.rpm"
RPM_HASH = "ff1180fe2272a409bfbe2ed67ffb90b458a971e40d641c6e6947886925be97b68ea3af13e0f6894eb3be354db6869b6ddde518ed74ce257e8f734fbd15ab026e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer \
config-adminer"

RDEPENDS:${PN} += "/usr/bin/sh \
adminer-database-support \
mod-php-any \
php-iconv \
php-mbstring \
php-session \
php-zlib"

inherit rpm
