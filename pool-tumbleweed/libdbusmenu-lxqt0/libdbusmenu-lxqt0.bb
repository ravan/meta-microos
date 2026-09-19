SUMMARY = "Development package for dbusmenu-lxqt-qt6"
DESCRIPTION = "This library provides a Qt implementation of the DBusMenu protocol. \
 \
The DBusMenu protocol makes it possible for applications to export and import \
their menus over DBus. Qt5 library"
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "libdbusmenu-lxqt0-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "9db16dd8279dc88f30a1dd9740e9de3829d2800232190fbaba945ec1c9177735c57a4ca287319ed6f18ce785ac77e854278157fa2b41c43c9de4cfed420d1b8e"

RPROVIDES:${PN} += "libdbusmenu-lxqt.so.0 \
libdbusmenu-lxqt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
