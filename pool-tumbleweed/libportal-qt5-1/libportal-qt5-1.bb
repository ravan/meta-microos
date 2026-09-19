SUMMARY = "Qt5 integration for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the shared library of libportal-qt5."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-qt5-1-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "27d5b4857bb10fccc02069596798a773112076b62273283e237326194fcd0a18a4bb469d2d37134f09bb1ae869cc29d1f8fac3e30ec4519a9406a5daf7b58747"

RPROVIDES:${PN} += "libportal-qt5-1 \
libportal-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libportal.so.1 \
libstdc++.so.6"

inherit rpm
