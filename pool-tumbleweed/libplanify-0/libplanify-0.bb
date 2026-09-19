SUMMARY = "Library files for planify"
DESCRIPTION = "Library files for planify."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.5"

RPM_NAME = "libplanify-0-4.19.5-1.1.aarch64.rpm"
RPM_HASH = "9aa5006e2d1fd8aa0814071d75bfb2de93593015b38511cb664e5cf55d4a25d943e9f47923a66f7160e71deea277f4159802eafe9fddff2d1b1c685d623e1062"

RPROVIDES:${PN} += "libplanify-0 \
libplanify.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libchrono.so.0 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libgxml-0.20.so.2.0.2 \
libical-glib.so.3 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libspelling-1.so.2 \
libsqlite3.so.0"

inherit rpm
