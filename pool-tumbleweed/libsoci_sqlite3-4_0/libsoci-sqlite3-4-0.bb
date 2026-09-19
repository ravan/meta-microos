SUMMARY = "SQLite back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for SQLite."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_sqlite3-4_0-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "d835dbc9f62275f2b3ad009007785914509f0dcfb6bbe99e2ab567a44692fab6bfb2298cbb80e63f3bf25f3f2d1ea930759bf8d68cbc662ef82ad551c485506e"

RPROVIDES:${PN} += "libsoci-sqlite3-4-0 \
libsoci-sqlite3.so.4.0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci-core.so.4.0 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
