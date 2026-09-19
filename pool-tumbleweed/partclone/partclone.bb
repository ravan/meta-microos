SUMMARY = "File System Clone Utilities"
DESCRIPTION = "A set of file system clone utilities, including \
ext2/3, reiserfs, reiser4, xfs, hfs+ file systems"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.50"

RPM_NAME = "partclone-0.3.50-1.1.aarch64.rpm"
RPM_HASH = "c74a950545133a0dc579dc8b4dce746d623758a902e02ce9619d8e79e3506b4ea5574198d96e2482de7615e49e59f1f18013c781ae611550a2a7d82860d28846"

RPROVIDES:${PN} += "partclone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libext2fs.so.2 \
libncursesw.so.6 \
libnilfs.so.3 \
libntfs-3g.so.90 \
libtinfo.so.6 \
liburcu.so.8 \
libuuid.so.1 \
libxxhash.so.0"

inherit rpm
