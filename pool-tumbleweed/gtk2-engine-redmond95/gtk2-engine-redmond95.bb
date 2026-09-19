SUMMARY = "Redmond GTK+ 2 Theme Engine"
DESCRIPTION = "The Redmond engine and theme are designed to mimic the appearance of \
another well known OS."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-redmond95-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "1aeb3a60e9993606d354b2f03aa0444dfb8327f53a2bc1585acf1ae00c36081935505ec4f01d63d34271b8bad443b47a31db499bfe9439d204f4636b15419e32"

RPROVIDES:${PN} += "gtk2-engine-redmond95 \
libredmond95.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
