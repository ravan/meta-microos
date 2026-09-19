SUMMARY = "Library for libadapta"
DESCRIPTION = "Library for libadapta."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libadapta-1-0-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "8a8b2a39b4b9ea5a47d3b6c34068f5188e74f054f91d5b2c2af9712296b478fa4a4862a1ed66deeb781367c40aae7b309041b8c8eb7fd26570d0c0f3422dd91b"

RPROVIDES:${PN} += "libadapta \
libadapta-1-0 \
libadapta-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libappstream.so.5 \
libc.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
