SUMMARY = "Library That Implements Different Microsoft Compressions"
DESCRIPTION = "The purpose of libmspack is to provide both compression and \
decompression of some loosely related file formats used by Microsoft. \
Currently the most common formats are implemented."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "libmspack0-0.11-2.11.aarch64.rpm"
RPM_HASH = "bb55c3c0e13731a9b049a863ba80f17fad730d695c339eafcbd656238cbb0c322a0ba83e69efb41d9bca31230899358fccf58bdb9fb1c81d17b64dcf484c54d9"

RPROVIDES:${PN} += "libmspack.so.0 \
libmspack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
