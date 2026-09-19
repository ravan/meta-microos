SUMMARY = "Shared library for libtar"
DESCRIPTION = "libtar is a C library for manipulating POSIX tar files. It handles adding \
and extracting files to/from a tar archive. \
 \
This package contains the shared library needed for libtar."
LICENSE = "BSD-3-Clause"

PV = "1.2.20"

RPM_NAME = "libtar1-1.2.20-3.3.aarch64.rpm"
RPM_HASH = "1db8f7a270f12c26f69567f4dd290a39b4fb5c01dd306d4ebf40e922429bc33c9d1dcc8201712aaa208906815d418b84185f1db276bd1a76483f86d7c966192c"

RPROVIDES:${PN} += "libtar.so.1 \
libtar1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
