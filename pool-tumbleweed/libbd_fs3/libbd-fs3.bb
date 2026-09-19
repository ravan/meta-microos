SUMMARY = "The FS plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to operations with file systems."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_fs3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "2630bc0cf2aba7729b1bd2c83a09a6b3c5d558e4300d0215f40d436674d1fd940fcf3312802e8d41a8a463c327d96b72fbb7bc22a3eec728eb8f535d4df1347b"

RPROVIDES:${PN} += "libbd-fs.so.3 \
libbd-fs3 \
libblockdev-fs"

RDEPENDS:${PN} += "/sbin/ldconfig \
device-mapper \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libblkid.so.1 \
libc.so.6 \
libe2p.so.2 \
libext2fs.so.2 \
libglib-2.0.so.0 \
libmount.so.1 \
libuuid.so.1"

inherit rpm
