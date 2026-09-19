SUMMARY = "FUSE file system client for ext2/ext3/ext4 file systems"
DESCRIPTION = "fuse2fs is a FUSE file system client that supports reading and \
writing from devices or image files containing ext2, ext3, and \
ext4 file systems."
LICENSE = "MIT"

PV = "1.47.3"

RPM_NAME = "fuse2fs-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "efa67216c0628c8a97b5fa4fc2309c35ee7d964d91982716a6fe2cd8de4d3eb71bc3c459ada44e42f863a9a11bdf608eeea2363f6feb09a1d64c95a8985d426e"

RPROVIDES:${PN} += "fuse2fs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcom-err.so.2 \
libe2p.so.2 \
libext2fs.so.2 \
libfuse3.so.4 \
libuuid.so.1"

inherit rpm
