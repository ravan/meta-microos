SUMMARY = "Wayland client side decoration library"
DESCRIPTION = "A library that can help Wayland clients draw window decorations for them. \
It aims to provide multiple backends that implements the decoration drawing."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libdecor-0.2.5-1.6.aarch64.rpm"
RPM_HASH = "e80526a03451f7425984853e3fbff8f9521baee7f566b68279829590d446aa84459dd0c1fde1f3027f185b461b383fd57de452312e435d0d848518cafa41a4cf"

RPROVIDES:${PN} += "libdecor \
libdecor-cairo.so \
libdecor-gtk.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdecor-0.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
