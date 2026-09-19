SUMMARY = "Shared library for libzdb"
DESCRIPTION = "Zild Database Library \
 \
This package contains the shared libzdb library"
LICENSE = "GPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "libzdb17-3.4.1-1.5.aarch64.rpm"
RPM_HASH = "df42180ea2046240619777e99ef5a5d9cc1ca86a19c53bac6b2329f77bc092bd155e5aa83414dd17057f457ccae532032965d158447216fc93773954d92c802b"

RPROVIDES:${PN} += "libzdb \
libzdb.so.17 \
libzdb17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0"

inherit rpm
