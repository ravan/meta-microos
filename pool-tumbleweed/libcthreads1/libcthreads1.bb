SUMMARY = "Library for C thread functions"
DESCRIPTION = "A library for C thread functions. \
 \
libcthreads is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcthreads1-20260703-1.2.aarch64.rpm"
RPM_HASH = "d9fb217ff8caef289f421a363acab310da38ac3faec5990faac2351c730cbbca5e5212d9612f3ec75c9b4a8ecfb76147c822626308ebd84c438f7727fbfead21"

RPROVIDES:${PN} += "libcthreads.so.1 \
libcthreads1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
