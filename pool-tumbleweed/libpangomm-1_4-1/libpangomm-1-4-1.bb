SUMMARY = "C++ interface for pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.5"

RPM_NAME = "libpangomm-1_4-1-2.46.5-1.3.aarch64.rpm"
RPM_HASH = "ae230e3517ccb4cec6b9af464e7f1e63d0339ace77f6e7238a358b3f8901c8a706013c8f33718337caa79e3aa8515a085e4e664334e60807bec30f2b83c87cde"

RPROVIDES:${PN} += "libpangomm-1-4-1 \
libpangomm-1.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
