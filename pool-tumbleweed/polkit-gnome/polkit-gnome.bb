SUMMARY = "PolicyKit integration for the GNOME desktop"
DESCRIPTION = "polkit-gnome provides an authentication agent for PolicyKit \
that matches the look and feel of the GNOME desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.105"

RPM_NAME = "polkit-gnome-0.105-17.3.aarch64.rpm"
RPM_HASH = "63a167880c9bc132fa3d9567a3fc2b27b9f04697dc2fe8165b51c464f6934e016b6ca7e0778c986e8dff188865e2a91c61301f565d1b212644a97fa6cbfbf930"

RPROVIDES:${PN} += "polkit-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
