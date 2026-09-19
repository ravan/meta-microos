SUMMARY = "Empty back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains an empty back-end."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_empty4_0-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "9353aaa05326a5cb065e24c6c564caba4763de7a0db7b7a983bd791ff55b20ddb74e0da931e58951d2a93281840cc7c9f752dd138fc69224dbc2300227bdfe13"

RPROVIDES:${PN} += "libsoci-empty.so.4.0 \
libsoci-empty4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
