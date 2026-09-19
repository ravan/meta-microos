SUMMARY = "JPEG-2000 Part-15 library"
DESCRIPTION = "This is an implementation of High-throughput JPEG2000 (HTJ2K), also \
known as JPH, JPEG2000 Part 15, ISO/IEC 15444-15, or ITU-T T.814. \
Only the LGT 5/3 wavelet transform for lossless compression and the \
CDF 9/7 wavelet transform for lossy compression are supported."
LICENSE = "BSD-2-Clause"

PV = "0.31.0"

RPM_NAME = "libopenjph0_31-0.31.0-1.1.aarch64.rpm"
RPM_HASH = "dc40630069bb4cf460d7b3d450818a6d49cd93a4cee9544685da63b600cbf3fe20ad9fd84f87b54996c195f1dd661e08032d7167a8dfcf4190adcca956c4c0d4"

RPROVIDES:${PN} += "libopenjph.so.0.31 \
libopenjph0-31"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
