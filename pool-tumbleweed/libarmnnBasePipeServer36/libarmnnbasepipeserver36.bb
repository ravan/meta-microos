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

RPM_NAME = "libarmnnBasePipeServer36-26.07-1.1.aarch64.rpm"
RPM_HASH = "66adb449579b8e78a2e6860846290a75d0546da08eb5f640cc74cd5c345337a1fa50182cae267ff18f1f25074f2c1c76f0f8edec262f28060cc547c347a6cbec"

RPROVIDES:${PN} += "libarmnnBasePipeServer.so.36 \
libarmnnBasePipeServer36"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
