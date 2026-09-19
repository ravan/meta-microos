SUMMARY = "Adaptive Entropy Coding library"
DESCRIPTION = "Libaec provides lossless compression of signed or unsigned integers \
(samples) of sizes 1 to 32 bits wide. The library achieves best \
results for low entropy data as often encountered in space imaging \
instrument data or numerical model output from weather or climate \
simulations. While floating point representations are not directly \
supported, they can also be efficiently coded by grouping exponents \
and mantissa. \
 \
Libaec implements Golomb Rice coding as defined in the Space Data \
System Standard documents 121.0-B-3 and 120.0-G-2."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "libaec0-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "4f92422368c66c469b5cc51a12e7739980c6940fb544fc2dcbc8e26a604b2d1ff0851922f575eeb2ee8a5dd11de06375560a5169a26c539c799f25795bedb3be"

RPROVIDES:${PN} += "libaec.so.0 \
libaec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
