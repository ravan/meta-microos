SUMMARY = "C++ interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl14-1.2-3.12.aarch64.rpm"
RPM_HASH = "ab9cb9ca363c5797119ba20008c8172c4361d7bbd8bc28d409eb2a3cd5fa0dcaab8f4b98e98e97bafbf8de0193519888f041318ebd672dc1111d53c7c20df01c"

RPROVIDES:${PN} += "libppl.so.14 \
libppl14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
