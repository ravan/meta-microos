SUMMARY = "Application indicators library"
DESCRIPTION = "A library to allow applications to export a menu into the Unity Menu bar. Based \
on KSNI it also works in KDE and will fallback to generic Systray support if \
none of those are available."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator1-12.10.1~bzr20200706.298-4.9.aarch64.rpm"
RPM_HASH = "c1f2ff14572a8e9d8e016c86402f4cfefbbc2c33f613ae42d01456067f7d25510710131c53179cc4bf8884873cd9add2d5777e9ca813d33c88309e946005a0ad"

RPROVIDES:${PN} += "libappindicator \
libappindicator.so.1 \
libappindicator1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk.so.4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
