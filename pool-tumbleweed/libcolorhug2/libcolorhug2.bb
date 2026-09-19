SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "libcolorhug2-1.4.8-3.1.aarch64.rpm"
RPM_HASH = "2d49c46df853bc52c860c663a2961103946449015168bd123c45463e4a4e19e75de8aac4b038b4116a2b5b7a262f034901422ab49351cc7b7d04f8b233fcef78"

RPROVIDES:${PN} += "libcolorhug.so.2 \
libcolorhug2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcolordprivate.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2"

inherit rpm
