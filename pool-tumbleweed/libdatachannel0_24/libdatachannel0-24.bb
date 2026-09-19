SUMMARY = "C++ library for libdatachannel"
DESCRIPTION = "libdatachannel is a standalone implementation of WebRTC Data Channels, \
WebRTC Media Transport, and WebSockets in C++17 with C bindings for POSIX platforms \
(including GNU/Linux, Android, FreeBSD, Apple macOS and iOS) and Microsoft Windows."
LICENSE = "MPL-2.0"

PV = "0.24.5"

RPM_NAME = "libdatachannel0_24-0.24.5-1.1.aarch64.rpm"
RPM_HASH = "f3093d40f7f1a3e61f3d119b5a155dbe398f94748e32fc7f7b0cb9287e624f1f237e8cc8e6dc62f30a17e41390303fcd952fda043f3fc856ef85605503245033"

RPROVIDES:${PN} += "libdatachannel.so.0.24 \
libdatachannel0-24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libm.so.6 \
libnettle.so.8 \
libnice.so.10 \
libsrtp2.so.1 \
libstdc++.so.6 \
libusrsctp.so.2"

inherit rpm
