SUMMARY = "Mahjong Solitaire Game for GNOME"
DESCRIPTION = "Mahjongg is a solitaire version of the classic Eastern tile game. It \
involves clearing as much of the board as possible by matching \
corresponding tiles and taking them out of play."
LICENSE = "GPL-2.0-or-later"

PV = "49.1.1"

RPM_NAME = "gnome-mahjongg-49.1.1-2.3.aarch64.rpm"
RPM_HASH = "14df9cfc23f03b77aeb4ebb104eaaaba429b6d65c266c6236c33aadca98b52331c5909ae0099e3ace4b7e76030c96d5964b00e8ee592d0283ac75189b3faa253"

RPROVIDES:${PN} += "gnome-mahjongg \
mahjongg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
