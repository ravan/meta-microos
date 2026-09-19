SUMMARY = "Libraries for qtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "GPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "libQt5Xdg3-3.12.0-3.12.aarch64.rpm"
RPM_HASH = "fa7b37327385e84b6b919776208e08e9163ef9a19654653bdb4b844ee6bb651ec2b243e60691ce20b0fd7dc3959377ffc2281f039aad104aa0c9b5f9b5a7e73d"

RPROVIDES:${PN} += "libQt5Xdg.so.3 \
libQt5Xdg3 \
libqtxdg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XdgIconLoader.so.3 \
libQt5Xml.so.5 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
