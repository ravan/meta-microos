SUMMARY = "Chess Game for GNOME"
DESCRIPTION = "This is a game for playing the classic board game of chess, in which \
two players simulate a battle by capturing the opponents pieces and \
ultimately the king. It can be played in 2D or 3D mode, full screen or \
in a window."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-chess-50.0-1.3.aarch64.rpm"
RPM_HASH = "10e19ffa913e521c7b3a60b24e3ff18f2e7bb6f79c3e864bd7d10d48190bd6790a266f1a282fb4876c351683da99eabdef1f89301c4b7c16306c49b414f7bfdd"

RPROVIDES:${PN} += "config-gnome-chess \
gnome-chess"

RDEPENDS:${PN} += "chess-backend \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
