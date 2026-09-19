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

RPM_NAME = "libtimelineDecoder36-26.07-1.1.aarch64.rpm"
RPM_HASH = "48e37430789eb504fdd2ef4f7010b273630fd52fc1c8bd5a86c0e22b341da18ada0b3929fe04cd7551f9710e6fe39e26dd06cffa54a0155db35830b561d560a1"

RPROVIDES:${PN} += "libtimelineDecoder.so.36 \
libtimelineDecoder36"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
