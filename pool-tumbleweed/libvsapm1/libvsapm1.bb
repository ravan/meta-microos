SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260713"

RPM_NAME = "libvsapm1-20260713-1.2.aarch64.rpm"
RPM_HASH = "29c7c6642cb2ce64dfe8ccd973f4628f7bf2a21458017e300c639f0d8cc402334f5876f94507378c4e7d0f6230e536202bc16c6052873167fd43075edaae74e9"

RPROVIDES:${PN} += "libvsapm.so.1 \
libvsapm1"

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
