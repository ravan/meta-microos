SUMMARY = "Reversi Game for GNOME"
DESCRIPTION = "Iagno is the two player strategy game of Othello, which is also known \
as Reversi and is similar to Go. The pieces are tiles that are black \
on one side and white on the other and the objective is for the player \
to flip his/her opponent's tiles to his/her color, while keeping the \
opponent from doing the same. Once the board is filled with tiles, the \
winner is the player with the most of his/her color tiles on the \
board."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+8"

RPM_NAME = "iagno-50.0+8-1.2.aarch64.rpm"
RPM_HASH = "3ea91e6146d910a1a951bc96b7e74e0308b3852ddde48a70745027e3d9efabc58c54bf2ce134c0b1ab04cf8d4c471a93df27b6b3e12f61fac1ab44a633c0bde4"

RPROVIDES:${PN} += "iagno"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
