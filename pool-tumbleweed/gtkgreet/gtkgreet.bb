SUMMARY = "GTK based greeter for greetd"
DESCRIPTION = "GTK based greeter for greetd, to be run under cage or similar."
LICENSE = "GPL-3.0-only"

PV = "0.8"

RPM_NAME = "gtkgreet-0.8-1.11.aarch64.rpm"
RPM_HASH = "a869e049dbe3891d4e56f0f37493abadaba50ab69946581f7e3f15e42d1026ecefdf0e5b46fcce7b388116430c75ee5b5fa4f78085ad2c07be6f07d9178330ce"

RPROVIDES:${PN} += "gtkgreet"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libjson-c.so.5"

inherit rpm
