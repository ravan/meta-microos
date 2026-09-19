SUMMARY = "Library implementing a VNC client"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.15"

RPM_NAME = "libvncclient1-0.9.15-4.1.aarch64.rpm"
RPM_HASH = "07fb205e34184f9220010519b85746e69d7cac28df7d0ff27facca79e8cb54537aeef2bb89e89f8b35e2472222bed89cc87246136a6d13e86ff4e79b8875068a"

RPROVIDES:${PN} += "libvncclient.so.1 \
libvncclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libjpeg.so.8 \
liblzo2.so.2 \
libz.so.1"

inherit rpm
