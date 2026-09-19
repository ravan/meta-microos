SUMMARY = "Set of generic loaders for Evas"
DESCRIPTION = "Set of generic loaders allowing to open XCF, PDF, PS, RAW, \
MPG/AVI/OGV/MOV/MKV/WMV. \
 \
Useful only for evas library. \
 \
This part of the Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "evas-generic-loaders-1.26.3-37.1.aarch64.rpm"
RPM_HASH = "4bd412ae300546a207196785f02f59bc150d71f545c33d651ec239562d3e72151664568102820cd0c4f995c1d64b0ed4686f3c8b2d00157a2e9a22a7dea34a07"

RPROVIDES:${PN} += "evas-generic-loaders"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libeina.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpoppler-cpp.so.3 \
libraw.so.25 \
librsvg-2.so.2 \
libspectre.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
