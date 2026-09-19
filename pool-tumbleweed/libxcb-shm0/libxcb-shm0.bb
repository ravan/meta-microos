SUMMARY = "X11 Shared Memory Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The MIT Shared Memory (MIT-SHM) Extension allows exchanging image \
data between client and server using shared memory, so that it does \
not need to be transferred over sockets."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-shm0-1.17.0-2.7.aarch64.rpm"
RPM_HASH = "9a198fa73fdb8402bd35bc1cf817f0850519f26c85aff21827c01d9e018cbd6464b34f6d139f1a8292df5fec960c9b320c72a0b83aa92f0019a7c3a7e56ede9a"

RPROVIDES:${PN} += "libxcb-shm.so.0 \
libxcb-shm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
