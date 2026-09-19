SUMMARY = "Library to access Blu-Ray disk"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libbluray3-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "c5289278232e2e46768bba50d04d0092f1f088befc09d62501e15071bcd899bc3af657d216769f0a8ba292e24d0fd2f42a3e25c0eb2fd82d3e7fe781e29c4bde"

RPROVIDES:${PN} += "libbluray.so.3 \
libbluray3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libudfread.so.3 \
libxml2.so.16"

inherit rpm
