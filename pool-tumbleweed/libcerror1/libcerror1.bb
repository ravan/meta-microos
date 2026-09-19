SUMMARY = "Library for C error functions"
DESCRIPTION = "A library for C error functions. \
 \
This package is part of the libyal library collection and is used by \
other libraries in the collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcerror1-20260703-1.2.aarch64.rpm"
RPM_HASH = "b867b912d4b011156596b0a99baf61def7d1f73f61172078453a1c22985807b0557461d08c5b0c4b5c186382c9258b07c8525fbd78f65c621ff4e7135fe7e018"

RPROVIDES:${PN} += "libcerror.so.1 \
libcerror1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
