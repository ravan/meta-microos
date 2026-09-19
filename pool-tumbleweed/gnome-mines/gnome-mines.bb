SUMMARY = "Minesweeper Game for GNOME"
DESCRIPTION = "This is the popular logic puzzle minesweeper, which includes avoiding \
mines while receiving clues for the location of the mines."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-mines-50.0-1.3.aarch64.rpm"
RPM_HASH = "f5b7631099f4ebeb567f817d95d856b6f63f1cdc47cb2d3945538191a02cf370ce2b84cdc0c96a29cea88ab5c5777cab3f10caaaa0901fb38513ce46cddaad17"

RPROVIDES:${PN} += "gnome-mines"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
