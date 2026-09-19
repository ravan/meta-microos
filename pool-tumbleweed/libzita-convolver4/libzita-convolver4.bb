SUMMARY = "A partitioned convolution engine library"
DESCRIPTION = "Convolution engine based on FFT convolution and using non-uniform partition \
sizes: small ones at the start of the IR and building up to the most efficient \
size further on. It can perform zero-delay processing with moderate CPU load. \
 \
Main features: \
  * Any matrix of convolutions between up to up 64 inputs and 64 outputs, as \
    long as your CPU(s) can handle it. \
  * Allows trading off CPU load to processing delay, and remains efficient even \
    when configured for zero delay. \
  * Sparse and diagonal matrices are handled as efficiently as dense ones. \
    No CPU cycles or memory resources are wasted on empty cells in the matrix, \
    nor on empty partitions if IRs are of different length."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "libzita-convolver4-4.0.3-1.25.aarch64.rpm"
RPM_HASH = "1285a7355f101eb640564dedbbfa1334ee456eb7739d9c214bf07fcf4af7ac433c2537f1c373d6e3b574c1e297774ab437be5a1b97141f48c996207d2db8cd55"

RPROVIDES:${PN} += "libzita-convolver.so.4 \
libzita-convolver4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
