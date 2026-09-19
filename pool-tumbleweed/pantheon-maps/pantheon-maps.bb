SUMMARY = "Map viewer designed for the pantheon desktop"
DESCRIPTION = "This is a fork of Atlas Maps and wouldn't exist without work of Steffen Schuhmann"
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-maps-8.1.0-1.4.aarch64.rpm"
RPM_HASH = "d1f1390d1dc9c625802e5a6f1059e9738347008112b83fb83774f8c088ab320d4fae547f89b4883242efc745ffce1bbf35e9763f081dd0dc69e35305a18cc24f"

RPROVIDES:${PN} += "pantheon-maps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libshumate-1.0.so.1"

inherit rpm
