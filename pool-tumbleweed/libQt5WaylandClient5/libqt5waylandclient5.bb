SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde55"

RPM_NAME = "libQt5WaylandClient5-5.15.19+kde55-1.2.aarch64.rpm"
RPM_HASH = "269a89af6fe5374f0974218fa053fa7d5b55b20f61bcafe483e9e1f8a459d7152188f827fb4d362275a09faeb7bbd1a5ebd805ffb640bdda6fdeff71f8d76661"

RPROVIDES:${PN} += "libQt5WaylandClient.so.5 \
libQt5WaylandClient5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
