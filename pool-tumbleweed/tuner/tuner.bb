SUMMARY = "Minimalist radio station player"
DESCRIPTION = "An Internet Radio Station player for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "tuner-2.1.0-1.3.aarch64.rpm"
RPM_HASH = "a67035bb012e4e29447e6e37ee75e003efb97585ada80f9c51a6d167f5b9b92bf3e4eaad838f3458b3c2cb294ca24986bf8b421abaf92b8cbddeb7d7d621dd1d"

RPROVIDES:${PN} += "tuner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplayer-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
