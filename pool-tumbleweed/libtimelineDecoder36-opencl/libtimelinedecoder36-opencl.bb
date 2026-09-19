SUMMARY = "libtimelineDecoder from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libtimelineDecoder library from armnn."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "libtimelineDecoder36-opencl-26.07-1.1.aarch64.rpm"
RPM_HASH = "4777f40e4d916ecc7b49f50994d94478be4e168fa4910c00e000dbeedd599f529f648a8ebf875afbbde86bb57330cde84e9146e742e3cba4e39464056969ac64"

RPROVIDES:${PN} += "libtimelineDecoder.so.36 \
libtimelineDecoder36-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
