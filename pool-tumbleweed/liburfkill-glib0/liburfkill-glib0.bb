SUMMARY = "The glib binding library for urfkill"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "liburfkill-glib0-0.5.0-6.7.aarch64.rpm"
RPM_HASH = "08daafc12390d996a045e9b0db85ad755db9d9985bcdb43e590552618800caf50684bdb4c97b2758dec669de097a19672e29d2158ada2a5c28a6e6970ad7e929"

RPROVIDES:${PN} += "liburfkill-glib.so.0 \
liburfkill-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
