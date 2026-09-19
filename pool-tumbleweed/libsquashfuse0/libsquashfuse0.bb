SUMMARY = "FUSE module to mount squashfs images"
DESCRIPTION = "Squashfuse is a FUSE filesystem that allows a \
squashfs archive to be mounted in user-space. \
It is designed to be fast and memory-efficient, \
and supports most of the features of the squashfs format."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "libsquashfuse0-0.6.1-1.7.aarch64.rpm"
RPM_HASH = "15e87f0d7e1bd87c37082e2f31d945b082ebca30c9647e11343dd6aa35213e43c6367db38d889f8b72a507e28bb3e6c61d08b9b2239df715aed5a2d0eb8bff72"

RPROVIDES:${PN} += "libsquashfuse-ll.so.0 \
libsquashfuse.so.0 \
libsquashfuse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
