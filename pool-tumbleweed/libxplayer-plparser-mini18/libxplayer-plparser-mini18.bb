SUMMARY = "Mini Version of libxplayer-plparser18"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "libxplayer-plparser-mini18-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "8a5e96b61034e4214281194417e75e1b3d5bc96e6ff7b813b4c6e8e22686affcf308fb5c2fe79fb836a8612df2431ca03d0d25b0ba5acf702481f9ca8d7e9547"

RPROVIDES:${PN} += "libxplayer-plparser-mini.so.18 \
libxplayer-plparser-mini18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xplayer-plparser"

inherit rpm
