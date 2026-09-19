SUMMARY = "Decompression routines for ancient formats"
DESCRIPTION = "This is a collection of decompression routines for old formats popular \
in the Amiga, Atari computers and some other systems from 80's and 90's \
as well as some that are currently used which were used in a some \
specific way in these old systems. \
 \
For simple usage both a simple command line application as well as a \
simple API to use the decompressors are provided. The compression \
algorithm is automatically detected in most cases, however there are some \
corner cases where it is not entirely reliable due to weaknesses in the \
old format used."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "ancient-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "b0895d4c0f8f6b00741520f7bb3a0a25b8fb0dbf63a260a1f55705196a7ca06981783abe3075b0c028d9bf2546f741d8d86da56633e2a42750d58ecd8d8eeca1"

RPROVIDES:${PN} += "ancient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libancient.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
