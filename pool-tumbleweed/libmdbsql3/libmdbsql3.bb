SUMMARY = "MDB Tools ODBC driver for unixODBC"
DESCRIPTION = "Contains shared library libmdbsql3 from mdbtools"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libmdbsql3-1.0.1-1.6.aarch64.rpm"
RPM_HASH = "b5e62a91a9dfe4b27b69b6f46a4dd02baa429b1cfc50befd8b037eca4660ee4974d9fe52c3bc065c4c44cdf5a75b973505e360c0edc5509e75afa96d5ef6cfd3"

RPROVIDES:${PN} += "libmdbsql.so.3 \
libmdbsql3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3"

inherit rpm
