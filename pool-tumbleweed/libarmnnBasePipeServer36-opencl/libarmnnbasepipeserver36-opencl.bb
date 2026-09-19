SUMMARY = "libarmnnBasePipeServer from armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the libarmnnBasePipeServer library from armnn."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "libarmnnBasePipeServer36-opencl-26.07-1.1.aarch64.rpm"
RPM_HASH = "7e88c76ba97996b8820cfb9ec5c305d73f3dbfca4bc7bba034bba714b6d9b88a0dcba92fb0ce4728b91bbb452f05092e968edb4a88a15536595c8912b66797bc"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.36 \
libarmnnBasePipeServer36-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
