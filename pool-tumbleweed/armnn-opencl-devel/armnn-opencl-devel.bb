SUMMARY = "Development headers and libraries for armnn"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs. \
 \
This package contains the development libraries and headers for armnn."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "armnn-opencl-devel-26.07-1.1.aarch64.rpm"
RPM_HASH = "e3481c80ca4f2b7a3d61510fcab18c826173aab2b88057fb3bb34b4efc04ea575a54d68c83f18e4d34089e0438f737dcacf9fda39dbbd197b373bf73519c94c3"

RPROVIDES:${PN} += "armnn-opencl-devel \
cmake-Armnn"

RDEPENDS:${PN} += "armnn-opencl \
libarmnn36-opencl \
libarmnnBasePipeServer36-opencl \
libarmnnTestUtils3-opencl \
libtimelineDecoder36-opencl \
libtimelineDecoderJson36-opencl"

inherit rpm
