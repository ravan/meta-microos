SUMMARY = "Shows cockroaches running over the desktop"
DESCRIPTION = "The classic xroach game for X11: displays disgusting cockroaches on your root \
window. These creepy crawlies scamper around until they find a window to \
hide under. Whenever you move or iconify a window, the exposed beetles again \
scamper for cover. \
 \
Adapted for desktop environments like Gnome and KDE. Still works for FVWM, TWM \
and the like. \
 \
Original copyright 1991 by J. T. Anderson. Squish option contributed by \
Rick Petkiewizc. Virtual root code adapted from patch sent by Colin \
Rafferty who borrowed it from Tom LaStrange. Several other folks sent \
similar fixes. Some glitches removed by patch from Guus Sliepen. \
 \
Willem Vermin adapted Xroach for Gnome, KFE etc. and added a graphical \
user interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "xroachng-1.0.3-2.12.aarch64.rpm"
RPM_HASH = "f8cfe49cfa975073ac930e2774f3638e1e75e8cd835728f2ec7776dd2ca76480d2fd855d736fbed4e24348fd428110bcc54ee70b2f3b9dc7f875b0554ceeba5c"

RPROVIDES:${PN} += "xroachng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
