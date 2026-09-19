SUMMARY = "libarmnn from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnn library from armnn."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "libarmnn36-26.07-1.1.aarch64.rpm"
RPM_HASH = "7eaf3e94e936ee9e364f20a320f37ad124b26a954ad560f586a02c4ecabbc8268357ecbdfae289a9e9d1a84080eeb8c602f32f2f028843bc36bb8cf88cb28b81"

RPROVIDES:${PN} += "libarmnn.so.36 \
libarmnn36"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.53 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
