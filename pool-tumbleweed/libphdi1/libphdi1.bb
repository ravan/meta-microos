SUMMARY = "Library for accessing Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libphdi1-20260902-1.1.aarch64.rpm"
RPM_HASH = "32385e51a2b3b73e21727f48f52c1fb1208221b94a635c3f4da51ebaa4e1e153fb1d8c33167e70b613049f316c00f693d0af04b63324e0af5d9d7597b1ffc140"

RPROVIDES:${PN} += "libphdi.so.1 \
libphdi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcdirectory.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfguid.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
