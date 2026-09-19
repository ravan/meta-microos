SUMMARY = "Library for accessing the FAT file system"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "libfsfat1-20260826-1.1.aarch64.rpm"
RPM_HASH = "add99e065ebdd4972e78270ef164cdba7428558a5fbbd0b2b0db3489811bc99ae51d12c4c7b5781b263e6b8f663d281076a572efcd2316e5e0d8c2b3d68509b4"

RPROVIDES:${PN} += "libfsfat.so.1 \
libfsfat1"

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
