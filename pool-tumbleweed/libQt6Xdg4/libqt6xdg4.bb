SUMMARY = "Libraries for qtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "LGPL-2.1-only & SUSE-LGPL-2.1-with-digia-exception-1.1"

PV = "4.4.0"

RPM_NAME = "libQt6Xdg4-4.4.0-1.7.aarch64.rpm"
RPM_HASH = "2e5cff797666ed7439d3ecd912d9c7395e9fdffd54ba9c7dfb7d3adce40fcc530605e0a2ce27664f29da6f17bdcce18bfb5aa0da0623754b69d69d29c8e2fe21"

RPROVIDES:${PN} += "config-libQt6Xdg4 \
libQt6Xdg.so.4 \
libQt6Xdg4 \
libqtxdg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6XdgIconLoader.so.4 \
libQt6Xml.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
