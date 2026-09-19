SUMMARY = "Qt6 integration for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the shared library of libportal-qt6."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-qt6-1-0.10.0-1.5.aarch64.rpm"
RPM_HASH = "e14705b9ec2513d8d531e1d4f794aaf5585abc25987c508ee526e58cb5ca1321b656564a13dfebf6662af06e114b69e7174e0171e4d3134bce1ac4c83f2edbf5"

RPROVIDES:${PN} += "libportal-qt6-1 \
libportal-qt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libportal.so.1 \
libstdc++.so.6"

inherit rpm
