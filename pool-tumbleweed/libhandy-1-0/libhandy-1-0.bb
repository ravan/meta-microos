SUMMARY = "A GTK+ library to develop UI for mobile devices"
DESCRIPTION = "This package provides the shared library for libhandy, a library to \
help with developing mobile UI using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.3"

RPM_NAME = "libhandy-1-0-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "65aeeabf339dc65e93f6b9a9750300eee98146cd376ec79fcb733c3d5b13f61ecd7a92aa4b9185eef00803de7271276794ec1621446c6c99a0eee91d7d2f055e"

RPROVIDES:${PN} += "libhandy \
libhandy-1-0 \
libhandy-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
