SUMMARY = "Maliit input method framework"
DESCRIPTION = "Maliit provides a flexible and cross-platform input method framework. \
It has a plugin-based client-server architecture where applications \
act as clients and communicate with the Maliit server via input \
context plugins. The communication link currently uses D-Bus. Maliit \
is an open source framework (LGPL 2) with open source plugins (BSD). \
This package also provides plugin support."
LICENSE = "LGPL-2.1-only"

PV = "2.3.0"

RPM_NAME = "maliit-framework-2.3.0-1.18.aarch64.rpm"
RPM_HASH = "04d49d11a953df6f0f084420515ad0b55dc1f501b60e13df7c8e3a8c10a5dd7642fc5a7ec22b81755a8513627be867c8ea1052dc022c5b3495b7fb4fa6e8d709"

RPROVIDES:${PN} += "libinputpanel-shell.so \
libmaliitplatforminputcontextplugin.so \
maliit-framework"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmaliit-plugins.so.2 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
