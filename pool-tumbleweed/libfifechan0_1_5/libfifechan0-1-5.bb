SUMMARY = "Main library of the Fifechan GUI toolkit"
DESCRIPTION = "Main shared library of fifechan."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan0_1_5-0.1.5-1.28.aarch64.rpm"
RPM_HASH = "b77d12c793f4978cb847e63a5a5a658dd995400d90aa3cc9068dda4112efee9246a9c8454ef0fc8d49efa6574f633f19e0cfaaa64ce336a67f471e6922b5b0f1"

RPROVIDES:${PN} += "libfifechan.so.0.1.5 \
libfifechan0-1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
