SUMMARY = "Lights Out Game for GNOME"
DESCRIPTION = "Lights Out is a board game where the goal is to switch off all tiles. \
Toggling the status of one tile, will also toggle the status of its \
adjacent tiles."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "lightsoff-50.0-1.3.aarch64.rpm"
RPM_HASH = "b1de7d20774045616a9869b87270b9d3c8bd2aed355e79aa773c219033d4383925255e312709b8de835ad69d9b0f862791c2714f5ef6b9dc12ac6a0a6b018445"

RPROVIDES:${PN} += "lightsoff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6"

inherit rpm
