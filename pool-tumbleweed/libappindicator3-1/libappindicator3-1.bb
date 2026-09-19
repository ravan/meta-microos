SUMMARY = "Application indicators library"
DESCRIPTION = "A library to allow applications to export a menu into the Unity Menu bar. Based \
on KSNI it also works in KDE and will fallback to generic Systray support if \
none of those are available."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator3-1-12.10.1~bzr20200706.298-4.10.aarch64.rpm"
RPM_HASH = "5fc208845b5485c2383af2ec22f23f9568c8a5fb8d64a17a9d144b72a67492a2842e371e1cdc1468210d0258273f0e010a86ee0a922ef9e87fa83d7651143ec4"

RPROVIDES:${PN} += "libappindicator-gtk3 \
libappindicator3-1 \
libappindicator3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
