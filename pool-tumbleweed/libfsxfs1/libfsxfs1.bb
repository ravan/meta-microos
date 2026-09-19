SUMMARY = "Library for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libfsxfs1-20260901-1.1.aarch64.rpm"
RPM_HASH = "da946768d159ce5f556f4dce934e63d055ed0de05f2562fb9d2b9e2492f008bf6bf9c76757f47bc3f357886d9112a576d272127269213320d46fec28f7c71881"

RPROVIDES:${PN} += "libfsxfs.so.1 \
libfsxfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
