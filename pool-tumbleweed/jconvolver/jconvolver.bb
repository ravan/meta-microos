SUMMARY = "Convolution engine for JACK"
DESCRIPTION = "Jconvolver is a Convolution Engine for JACK, based on FFT convolution and using \
non-uniform partition sizes: small ones at the start of the IR and building up \
to the most efficient size further on. It can perform zero-delay processing with \
moderate CPU load. \
 \
Main features: \
  * Any matrix of convolutions between up to up 64 inputs and 64 outputs, as \
    long as your CPU(s) can handle it. \
  * Allows trading off CPU load to processing delay, and remains efficient even \
    when configured for zero delay. \
  * Sparse and diagonal matrices are handled as efficiently as dense ones. \
    No CPU cycles or memory resources are wasted on empty cells in the matrix, \
    nor on empty partitions if IRs are of different length."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "jconvolver-1.1.0-3.9.aarch64.rpm"
RPM_HASH = "29966488b3f5bc340948505c98948bd74258a1adcafa37c119b65e733ec7fdad98f2cae618264a10216a313fecfec94c2a5fafe4211ee4a2854cb5f609c2e843"

RPROVIDES:${PN} += "jconvolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-convolver.so.4"

inherit rpm
