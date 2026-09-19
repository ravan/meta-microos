SUMMARY = "Framework for browsing and searching media content -- Networking Helper Library"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "libgrlnet-0_3-0-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "cb7c5614610bafc1cea2f2b6c9e43c8730242fa7b9b39e51864bd65ee799c6c1b496f3c42dc7d22f69ebc0e9b58fda0b026eb0b2d762031a4e959e889a1e79fd"

RPROVIDES:${PN} += "libgrlnet-0-3-0 \
libgrlnet-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libsoup-3.0.so.0"

inherit rpm
