SUMMARY = "Tetravex Game for GNOME"
DESCRIPTION = "Tetravex is a simple puzzle game in which pieces have numbers on each \
side. The pieces must be positioned so that the same numbers touch \
each other, during which you are being timed. The times are then \
stored in a system-wide scoreboard."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.3"

RPM_NAME = "gnome-tetravex-3.38.3-1.7.aarch64.rpm"
RPM_HASH = "ac0c217e6c82522781a16f203fd03c07823404452de03f544703ea5546ee621a940c7abf683988c6debc52332a10658fc38070f90a9f804320ec3034900b2283"

RPROVIDES:${PN} += "gnome-tetravex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
