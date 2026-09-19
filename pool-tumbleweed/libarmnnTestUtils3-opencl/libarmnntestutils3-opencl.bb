SUMMARY = "libarmnnTestUtils from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnTestUtils library from armnn."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "libarmnnTestUtils3-opencl-26.07-1.1.aarch64.rpm"
RPM_HASH = "42014f166ff7cb11ec0e3cd244407791ab08b04a422ce1c86fa7a7c35c17b4ba229c0b7410cdcc6da95d60729893b52f3db67476e64d825d82a5ea4b6d1e5c7c"

RPROVIDES:${PN} += "libarmnnTestUtils.so.3 \
libarmnnTestUtils3-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.36 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
