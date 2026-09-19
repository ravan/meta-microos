SUMMARY = "Launcher for wlroots compositors"
DESCRIPTION = "Wofi is a launcher/menu program for wlroots based wayland compositors such as sway."
LICENSE = "GPL-3.0-only"

PV = "1.5.3"

RPM_NAME = "wofi-1.5.3-1.4.aarch64.rpm"
RPM_HASH = "5a4a987b66ff0d9a8058d70ab99ff1e443ea4ba404d9c30719a3f2cf95cd21564fed4d30681658ac0c235c2da9df0ebaf5920ed24d7b11d35ad8c4b2801ee681"

RPROVIDES:${PN} += "wofi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
