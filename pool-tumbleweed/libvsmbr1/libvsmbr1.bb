SUMMARY = "Library for accessing the MS-DOS partition table format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libvsmbr1-20240505-1.20.aarch64.rpm"
RPM_HASH = "3de31a7aa69101695746661aada0ca9440d1007aa627b8517e5f34e191270104fdcd3db7907e0bba540094fa70382f91c3c1310a09adbae87356ea21ec8f87a8"

RPROVIDES:${PN} += "libvsmbr.so.1 \
libvsmbr1"

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
libfdata.so.1"

inherit rpm
