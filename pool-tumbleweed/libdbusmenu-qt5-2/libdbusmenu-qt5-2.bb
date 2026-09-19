SUMMARY = "Development package for dbusmenu-qt5"
DESCRIPTION = "This library provides a Qt implementation of the DBusMenu protocol. \
 \
The DBusMenu protocol makes it possible for applications to export and import \
their menus over DBus. Qt5 library"
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3+16.04.20160218"

RPM_NAME = "libdbusmenu-qt5-2-0.9.3+16.04.20160218-3.7.aarch64.rpm"
RPM_HASH = "a8bee64aeb8e5bfe9777e0e96aaa15818966f0e1602e83d56026c533dcc7c37d0c9a1d616760ddbe7ac3a94d2bad52b5e663bb22bd6c9d0863bffc2f6e91a9a4"

RPROVIDES:${PN} += "libdbusmenu-qt5-2 \
libdbusmenu-qt5.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
