SUMMARY = "MDB Tools ODBC driver for unixODBC"
DESCRIPTION = "Contains shared library libmdb3 from mdbtools"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libmdb3-1.0.1-1.6.aarch64.rpm"
RPM_HASH = "b26fae0c7c6b4adbbaddf9b655eda693e9b34ee94c2f615c10ac7def6373c37271c9cc3ac6ee97c4ba2dfb99726a2973e7c71fcea51c0d083e3f5fbaeeb6dd1d"

RPROVIDES:${PN} += "libmdb.so.3 \
libmdb3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
