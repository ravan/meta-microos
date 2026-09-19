SUMMARY = "FUSE module to mount squashfs images"
DESCRIPTION = "Squashfuse is a FUSE filesystem that allows a \
squashfs archive to be mounted in user-space. \
It is designed to be fast and memory-efficient, \
and supports most of the features of the squashfs format."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "squashfuse-0.6.1-1.7.aarch64.rpm"
RPM_HASH = "43316af35c1f5efc107863bef61276ebd90416603327c3147688f96f85c99f5d8d01dc9c458f6c14a6d281d9b0c6844c10cc190364c4f232bcb84e809d2e2a86"

RPROVIDES:${PN} += "squashfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
