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

RPM_NAME = "armnn-devel-26.07-1.1.aarch64.rpm"
RPM_HASH = "a4aee7a8f87d07cb02889532eeac49acf6da19b4c90b91ee317ce342780e331aeab7b7e482582da885ecbe6d7b9dc6d82d4dc778dca227867d8c46d90d172b16"

RPROVIDES:${PN} += "armnn-devel \
cmake-Armnn"

RDEPENDS:${PN} += "armnn \
libarmnn36 \
libarmnnBasePipeServer36 \
libarmnnTestUtils3 \
libtimelineDecoder36 \
libtimelineDecoderJson36"

inherit rpm
