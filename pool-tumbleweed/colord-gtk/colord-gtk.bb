SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "colord-gtk-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "1bdccc5db1b623144d6f42179828295a4ff774891890f2e090d6a0f07adab311622932451ec38e993dc44e7fceb0a330e0e1d7390c468295fcae862794ef4b55"

RPROVIDES:${PN} += "colord-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcolord-gtk.so.1 \
libcolord.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
