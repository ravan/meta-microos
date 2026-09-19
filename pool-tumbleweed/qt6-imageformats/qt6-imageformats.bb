SUMMARY = "Qt 6 ImageFormat Plugins"
DESCRIPTION = "Plugins for additional image formats: TIFF, MNG, TGA, WEBP, WBMP"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-imageformats-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ae3cf026449f20089a56fa97f965ec7e4a60d4d91a29b494e0966580abb806a8afd8a4a36a41433561e094d18f738fe5745a1989680297dcdcc8b3792270c9d5"

RPROVIDES:${PN} += "libqicns.so \
libqjp2.so \
libqmng.so \
libqtga.so \
libqtiff.so \
libqwbmp.so \
libqwebp.so \
qt6-imageformats"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libjasper.so.7 \
libm.so.6 \
libmng.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3"

inherit rpm
