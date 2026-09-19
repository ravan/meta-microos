SUMMARY = "Small X11 menu intended to be used with openbox and tint2"
DESCRIPTION = "jgmenu is a simple X11 menu intended to be used with tint2 and openbox."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "jgmenu-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "89ccd8c200d6feecc82441334cc37cf8571a73679eb48c333aeffa80bf44aeeb95e2b35515721ae8a7a9e664282fa94063f77ec7c1343b5cd9036116c3f30387"

RPROVIDES:${PN} += "jgmenu"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libxml2.so.16 \
typelib-GLib \
typelib-Gtk"

inherit rpm
