SUMMARY = "PostgreSQL back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_postgresql4_0-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "8bff911a3391e1b1915bb67d367b430e213592cf2d10b67ae257527f25d5bc3449596fdff953082c470c7f612b238a3d9aa3039d46eade4b240740f6ac928c51"

RPROVIDES:${PN} += "libsoci-postgresql.so.4.0 \
libsoci-postgresql4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
