SUMMARY = "C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.56.2"

RPM_NAME = "libpangomm-2_48-1-2.56.2-1.3.aarch64.rpm"
RPM_HASH = "1498d9590a89a1db752d9974bd7a99a9126dac95cfec7b53fc9fdd8a0fe9616ad25942879b4c99cb54a511fbd1a727408c97e9ed1267c28a727730ee473039de"

RPROVIDES:${PN} += "libpangomm-2-48-1 \
libpangomm-2.48.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairomm-1.16.so.1 \
libgcc-s.so.1 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
