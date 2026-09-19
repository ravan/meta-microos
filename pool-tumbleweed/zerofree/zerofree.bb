SUMMARY = "Utility for ext2,ext3,ext4 filesystems that zeroes out unallocated blocks"
DESCRIPTION = "zerofree is a utility for ext2,ext3 and ext4 filesystems that \
will scan the list of free blocks in a filesystem and fill with \
zeroes any blocks that do not already contain zeroes. \
 \
This RPM also includes the sparsify utility, which will scan all \
files in a filesystem and ensure that they are maximally sparse."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "zerofree-1.1.1-1.31.aarch64.rpm"
RPM_HASH = "8517f66c921934143aed57ecf9f2a3d1821b48add095d4ef75847a8b248f9d89bd2ccb819d5c93d0653615c39418519f14c83d2eb41983f9214e43b8dac28fb9"

RPROVIDES:${PN} += "zerofree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libext2fs.so.2"

inherit rpm
