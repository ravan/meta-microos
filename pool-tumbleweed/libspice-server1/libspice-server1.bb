SUMMARY = "Library for SPICE-server"
DESCRIPTION = "Library for SPICE-server \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.16.0"

RPM_NAME = "libspice-server1-0.16.0-1.6.aarch64.rpm"
RPM_HASH = "671e490217c5cb850058e64048bd31020513ea600099db87e5ad6990ebd4cc09e5e07113ecc6ac69ed2a506eecace8e092e84a06c0f8a838fa98a0a77359b44d"

RPROVIDES:${PN} += "libspice-server.so.1 \
libspice-server1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjpeg.so.8 \
liblz4.so.1 \
libm.so.6 \
libopus.so.0 \
liborc-0.4.so.0 \
libpixman-1.so.0 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libudev.so.1 \
libz.so.1"

inherit rpm
