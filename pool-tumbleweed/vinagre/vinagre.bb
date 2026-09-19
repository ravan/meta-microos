SUMMARY = "VNC client for GNOME"
DESCRIPTION = "Vinagre is a VNC client for GNOME that supports connecting to multiple \
machines, browsing for VNC servers via avahi and password storage in \
gnome-keyring."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.0"

RPM_NAME = "vinagre-3.22.0-21.1.aarch64.rpm"
RPM_HASH = "9da59c398f88ca4bddcc12fbb2f8e5af8b2f7c7483cbb2bc74721f07da52297440ce28c4cc140ebe042bd6f0e62b93b3591108c08ef08044fe506d3c9a8edb7f"

RPROVIDES:${PN} += "vinagre"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libavahi-gobject.so.0 \
libavahi-ui-gtk3.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libsecret-1.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libvte-2.91.so.0 \
libxml2.so.16"

inherit rpm
