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

RPM_NAME = "libtimelineDecoderJson36-opencl-26.07-1.1.aarch64.rpm"
RPM_HASH = "ba789da9138d45a0079583f4d83b8376deb5d4a983a2b57ce74e2e1db5c507e55062e5bc935c0bb449b910f4e6be90d6009a1b03c82ab5b4bb61934c1ee4f9d7"

RPROVIDES:${PN} += "libtimelineDecoderJson.so.36 \
libtimelineDecoderJson36-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
