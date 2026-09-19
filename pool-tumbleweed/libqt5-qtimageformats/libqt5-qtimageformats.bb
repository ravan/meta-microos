SUMMARY = "Qt 5 Image Format Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtimageformats-5.15.19+kde2-1.3.aarch64.rpm"
RPM_HASH = "818bb3a5431954b44e413161e32a2627d10ef17ac94c82ebfdd80f2b59a5c8790ef121fbe42927cbdc367586508a9384bc170bb1184788c41e57c79091ace4ea"

RPROVIDES:${PN} += "libqicns.so \
libqmng.so \
libqt5-qtimageformats \
libqtga.so \
libqtiff.so \
libqwbmp.so \
libqwebp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libmng.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3"

inherit rpm
