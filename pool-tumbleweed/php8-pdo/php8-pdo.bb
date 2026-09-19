SUMMARY = "PHP Data Objects extension for PHP"
DESCRIPTION = "The PHP Data Objects (PDO) extension defines an interface for \
accessing databases in PHP. Each database driver that implements the \
PDO interface can expose database-specific features as regular \
extension functions. Note that you use a database-specific PDO driver \
to access a database server. \
 \
PDO provides a data-access abstraction layer, which means that, \
regardless of the database used, you use the same functions to issue \
queries and fetch data. PDO does not provide a database abstraction; \
it does not rewrite SQL or emulate missing features."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-pdo-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "f4de1dc0309be2793e836facccc4d0f11735c26375c3ae0a2fa091547f038dbc8ea2abd3b87f6a68c8108a47f42cb0325a1f1a7fdb1d4780326692c6dd9660b9"

RPROVIDES:${PN} += "config-php8-pdo \
php-pdo \
php8-pdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
