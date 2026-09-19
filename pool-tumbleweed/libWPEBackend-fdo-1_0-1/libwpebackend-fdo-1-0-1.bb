SUMMARY = "Shared library for wpebackend-fdo"
DESCRIPTION = "A WPE backend designed for Linux desktop systems. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "1.16.1"

RPM_NAME = "libWPEBackend-fdo-1_0-1-1.16.1-1.5.aarch64.rpm"
RPM_HASH = "92db34366a7aeaee6ddc1188c98f276fdb4efcdb701ed4384e85e5c323d2590182d951c72fcda76fde82b49a7216b4be307e849813f0a9a2ca306fafd72d2513"

RPROVIDES:${PN} += "libWPEBackend-fdo-1-0-1 \
libWPEBackend-fdo-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwpe-1.0.so.1"

inherit rpm
