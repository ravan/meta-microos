SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-dba-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "fde4240171bfedbc936aca14a7454f69fca091c4122c8ead8235eff7d371687ddee03f604f9554df8ab7b677b3d4e9fd80f410e2e4396804dbff4866eeb36a6d"

RPROVIDES:${PN} += "config-php8-dba \
php-dba \
php8-dba"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
liblmdb-0.9.35.so \
php"

inherit rpm
