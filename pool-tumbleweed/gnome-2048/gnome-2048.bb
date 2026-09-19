SUMMARY = "Sliding block puzzle game"
DESCRIPTION = "2048 is a single-player sliding block puzzle game, in which the \
objective is to slide and merge same-numbered tiles on a grid to \
reach higher numbers."
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "gnome-2048-50.2-2.3.aarch64.rpm"
RPM_HASH = "8edd199e55fbb933e274e08394875450d01c260fad7899629bb990dd4e204ccd71577916fb36c2b7128e24ec18c2ba999286c6d90325e32c7033f4e09369a17e"

RPROVIDES:${PN} += "gnome-2048"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
