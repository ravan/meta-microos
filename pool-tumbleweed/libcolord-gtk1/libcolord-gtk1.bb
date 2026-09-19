SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Library"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "libcolord-gtk1-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "84f83079d1ca5bee3cf6231cad658225ada8dc8a6f05af907fd51731643d48e03ff05af4a79bbb7174671790e85c8557592bba47237b93684c2d20626cb5903b"

RPROVIDES:${PN} += "colord-gtk \
libcolord-gtk.so.1 \
libcolord-gtk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
