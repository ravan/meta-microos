SUMMARY = "Podcast app for GNOME"
DESCRIPTION = "A Podcast application for GNOME. \
Listen to your favorite podcasts, right from your desktop."
LICENSE = "GPL-3.0-or-later"

PV = "25.3"

RPM_NAME = "gnome-podcasts-25.3-3.2.aarch64.rpm"
RPM_HASH = "f263ef149a23cb366891758db691f0e08ca2f398ed6add6668181ea39c6c64551a815cca2ce9c2b3247ed1daccf4ed2b0d94f846229b1eb3ec4a73d3876d175c"

RPROVIDES:${PN} += "gnome-podcasts"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libssl.so.3"

inherit rpm
