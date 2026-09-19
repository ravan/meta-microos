SUMMARY = "Library to access the Extended File System (ext)"
DESCRIPTION = "libfsext is a library to access the Extended File System (ext). \
 \
Read-only supported ext formats: \
 \
* ext2 (version 2) \
* ext3 (version 3) \
* ext4 (version 4) \
 \
Supported ext format features: \
 \
* ext4 inline data \
 \
Unsupported ext format features: \
 \
* ext (version 1) \
* compression \
* encryption"
LICENSE = "LGPL-3.0-or-later"

PV = "20260821"

RPM_NAME = "libfsext1-20260821-1.1.aarch64.rpm"
RPM_HASH = "2a1f762481e36c0faad14a8bc7912816cfeb02979259bd8dbade56f4f36919bfcdd835080e8a9b72cbd74799e0c4b2c532fb99068eb6e36c1ba87d0d4bb8603d"

RPROVIDES:${PN} += "libfsext.so.1 \
libfsext1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
