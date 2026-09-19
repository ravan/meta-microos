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

RPM_NAME = "libarmnn36-opencl-26.07-1.1.aarch64.rpm"
RPM_HASH = "10cb4143abf4f1a83423bba2d9cceebd6f4eb032518aa59db18e230a1d3c2365fe4744508aa7769c628770f405e667c9ed58f4592c52be11be2108c2cfe20e57"

RPROVIDES:${PN} += "libarmnn.so.36 \
libarmnn36-opencl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.53 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
