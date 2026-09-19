SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "libgexiv2-0_16-4-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "9503904ca49b72efa9cfe62efda42e89b0271b013b971ed3fdcf1a3300e818082445798126e406feda0ebe484bf136c9c50481a7fd0fa722df8723c0fd45a1e1"

RPROVIDES:${PN} += "libgexiv2-0-16-4 \
libgexiv2-0.16.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
