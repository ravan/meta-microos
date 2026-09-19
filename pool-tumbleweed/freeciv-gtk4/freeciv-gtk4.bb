SUMMARY = "Gtk4 client for freeciv"
DESCRIPTION = "Freeciv executable using Gtk4 library"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "freeciv-gtk4-3.2.6-2.1.aarch64.rpm"
RPM_HASH = "1176cf39297171733c3535a46eb4ae564f77e973aaf4032356e1b47018e79a96a4941781ca57ef708b0d047a0a357a40148fbd7af7cf7a95bed64ad94c7b881e"

RPROVIDES:${PN} += "freeciv-client-3.2.6 \
freeciv-gtk4"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libSDL3-mixer.so.0 \
libSDL3.so.0 \
libc.so.6 \
libcairo.so.2 \
libfreeciv.so \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsqlite3.so.0"

inherit rpm
