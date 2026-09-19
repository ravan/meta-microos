SUMMARY = "Advanced color picker writen in GTK+"
DESCRIPTION = "Gpick is a featured color picker with palette creation and modification \
tools. It is written in C++ and uses GTK+ toolkit for user interface."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "gpick-0.3-2.7.aarch64.rpm"
RPM_HASH = "21777da89590185b7edd7edbdbf6af9614ef5c00b8b4668e4d154545d3aca073477baa982219f57d8938347e263d5db3f29b8b50062ea84d9a022d07b92b78b5"

RPROVIDES:${PN} += "gpick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
