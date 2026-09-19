SUMMARY = "Utilities for the Second Extended File System"
DESCRIPTION = "Utilities needed to create and maintain ext2 and ext3 file systems \
under Linux. Included in this package are: chattr, lsattr, mke2fs, \
mklost+found, tune2fs, e2fsck, resize2fs, and badblocks."
LICENSE = "GPL-2.0-only"

PV = "1.47.3"

RPM_NAME = "e2fsprogs-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "30f47eb77288e86a6c6062fee39028cb1bd3a7255b9ff4092072c2147b0c5e566f9f7a9f756e4cc717a04b6fc9e988593d8497ad3e2e928e8fe8079129f2f724"

RPROVIDES:${PN} += "config-e2fsprogs \
e2fsprogs"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcom-err2 \
libe2p.so.2 \
libext2fs.so.2 \
libext2fs2 \
libss.so.2 \
libuuid.so.1"

inherit rpm
