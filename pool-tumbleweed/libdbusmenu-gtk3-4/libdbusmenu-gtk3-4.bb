SUMMARY = "GTK+ 3 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 3 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "10d714eef1521b2633aceeecc1c871fa874da49b8390abb803fdb02ed7a4329ffdcb3a92acc63bee2fa4655805d0240384546833b0b702c8acfd6b9bf50714d9"

RPROVIDES:${PN} += "libdbusmenu-gtk3-4 \
libdbusmenu-gtk3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
