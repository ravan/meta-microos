SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "spice-gtk-0.43-1.1.aarch64.rpm"
RPM_HASH = "35221020279feb3ca0bb46f967199770493911f1eec89d203fdfcc74480014c9b63bdde3698c9d746e4a87fa144373b3188f54ad37dc73c7cb0c3a314c587513"

RPROVIDES:${PN} += "spice-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libwayland-server.so.0 \
permissions"

inherit rpm
