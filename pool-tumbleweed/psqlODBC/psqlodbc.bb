SUMMARY = "ODBC Driver for PostgreSQL"
DESCRIPTION = "This package contains the ODBC (Open DataBase Connectivity) driver and \
sample configuration files needed for applications to access a \
PostgreSQL database using ODBC."
LICENSE = "LGPL-2.1-or-later"

PV = "17.00.0008"

RPM_NAME = "psqlODBC-17.00.0008-1.3.aarch64.rpm"
RPM_HASH = "99ceb540952949f2f086dd507bb632391a56eb44abb3aac5d0120ba451767088d3dac393a6d9ee1b2d5ea188471eb5a7daebb22490171c0d711d1e5f9047ce42"

RPROVIDES:${PN} += "pg-iface-/usr/lib/pgsql/odbcinst.ini \
pg-odbc \
postgresql-odbc \
psqlODBC"

RDEPENDS:${PN} += "/usr/bin/odbcinst \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libodbcinst.so.2 \
libpq.so.5"

inherit rpm
