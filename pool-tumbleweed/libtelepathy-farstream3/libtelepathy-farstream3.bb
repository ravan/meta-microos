SUMMARY = "Telepathy library to handle Call channels"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libtelepathy-farstream3-0.6.2-4.8.aarch64.rpm"
RPM_HASH = "7dc3fd859bc64bc81f2c56167b36501061006bde93390c7e861d4b50f7b7b65f925ef2100e128d0a3ae5b024f7ff26822e4eabef8c5c130930985b0ef0234346"

RPROVIDES:${PN} += "libtelepathy-farstream.so.3 \
libtelepathy-farstream3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libfarstream-0.2.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
