SUMMARY = "Library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKExiv2Qt6-0-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "171dd3691aaa845102945db7fa3d73d8bd7d3b0017f480e09e36f5020863a124a418e6c67b79666f02bf65892ff9f88344d3d3a625fd81832a4111e63b5e697c"

RPROVIDES:${PN} += "libKExiv2Qt6-0 \
libKExiv2Qt6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libkexiv2-qt6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
