SUMMARY = "Gtk3 client for freeciv"
DESCRIPTION = "Freeciv executable using Gtk3 library"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "freeciv-gtk3-3.2.6-2.1.aarch64.rpm"
RPM_HASH = "6150ef37b60a77752539529b4928c99c3482858b2ceedba9f301a6d357721191b885f8c32a1a474eec9e5f329c22b414ed5ec838047083932292389637e4d4c8"

RPROVIDES:${PN} += "freeciv-client-3.2.6 \
freeciv-gtk3"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libSDL3-mixer.so.0 \
libSDL3.so.0 \
libc.so.6 \
libcairo.so.2 \
libfreeciv.so \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsqlite3.so.0"

inherit rpm
