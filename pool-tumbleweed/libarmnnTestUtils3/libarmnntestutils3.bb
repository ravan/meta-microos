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

RPM_NAME = "libarmnnTestUtils3-26.07-1.1.aarch64.rpm"
RPM_HASH = "992240a40818b39ce5c7a74f7c6eedde045e8947cb0038ba9610cc3bf4df1847db1261b4f6c3b0363cbc68201befb7d9e30facd3a7c4ee97362abf0fbcdf5c8e"

RPROVIDES:${PN} += "libarmnnTestUtils.so.3 \
libarmnnTestUtils3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarmnn.so.36 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
