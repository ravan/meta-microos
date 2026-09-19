SUMMARY = "Klotski Game for GNOME"
DESCRIPTION = "Klotski is a puzzle game of which the objective is to get the \
patterned block to the marker, which is done by moving the blocks in \
its way."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2+47"

RPM_NAME = "gnome-klotski-3.38.2+47-1.3.aarch64.rpm"
RPM_HASH = "2df7c128bf2672dbeab993caaa9f584434ff4eeaab082be3ac0c22f85635b5ca26e554d4caadc41b91c87d980fb0d0b2572514840a6c77715e199336f54939b4"

RPROVIDES:${PN} += "gnome-klotski"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
librsvg-2.so.2"

inherit rpm
