SUMMARY = "ODBC back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for unixODBC."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_odbc4_0-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "3e3fd0f68933ace33a94058073f9314fa311a2f03cb59ceb2d01c29b7e3e5de7f8d1c841c0d423318a2071a85951ce651bdb600ed152d46a0c82097d4ce330d0"

RPROVIDES:${PN} += "libsoci-odbc.so.4.0 \
libsoci-odbc4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
