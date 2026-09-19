SUMMARY = "libtimelineDecoderJson from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "libtimelineDecoderJson36-26.07-1.1.aarch64.rpm"
RPM_HASH = "fb257fc68f94c13c93b5378dad719bf02c065c150b13e27a1e98c4e9aaf8b07162049e7e2f02e15c9a7c91c95dc712e6d5cc92376e5d660dbf747da6d009eb17"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.36 \
libtimelineDecoderJson36"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
