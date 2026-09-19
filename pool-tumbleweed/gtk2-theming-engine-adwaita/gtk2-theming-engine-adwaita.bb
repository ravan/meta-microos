SUMMARY = "Adwaita GTK+ Theming Engine"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gtk2-theming-engine-adwaita-3.28-3.5.aarch64.rpm"
RPM_HASH = "6a4c2fc6a28e73667cc6e9c6eaada1c61073bc6a04ac7b785c8cfd6ba9e13ba11cc5426c81ac546a20ea64528464ea0879cf2ebfb00a6fe271e8b040c6cacc47"

RPROVIDES:${PN} += "gtk2-theming-engine-adwaita \
libadwaita.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
