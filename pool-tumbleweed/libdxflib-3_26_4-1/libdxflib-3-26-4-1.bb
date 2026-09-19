SUMMARY = "Parser library for the Drawing Exchange Format (DXF)"
DESCRIPTION = "dxflib is a C++ library mainly for parsing and writing DXF files. \
QCAD/LibreCAD uses dxflib to import DXF files."
LICENSE = "GPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libdxflib-3_26_4-1-3.26.4-2.18.aarch64.rpm"
RPM_HASH = "126cd51b7d1eb9f7f72f99424cc0355b7261cf31f4a2a8338d4fc4072e3f2bdde615ba88f44476b5c2a0e087dfe872bd3212209fe834f20b1b04735aa426f7ca"

RPROVIDES:${PN} += "libdxflib-3-26-4-1 \
libdxflib-3.26.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
