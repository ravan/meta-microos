SUMMARY = "CleanIce GTK Theme Engine"
DESCRIPTION = "Simple, clean theme engine for GTK2."
LICENSE = "GPL-2.0"

PV = "2.4.1"

RPM_NAME = "gtk2-engine-cleanice-2.4.1-20.5.aarch64.rpm"
RPM_HASH = "f6afae76f41c5d93be5e3f5da484664053cafb1fa5ee42d166bffbcc1c2c617259c6a6b875cfc1ff244127c1d1ebfdecff95456f80e480e67a0cf773055dde31"

RPROVIDES:${PN} += "gtk2-engine-cleanice \
libcleanice.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
