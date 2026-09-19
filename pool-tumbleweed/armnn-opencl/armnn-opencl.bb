SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "armnn-opencl-26.07-1.1.aarch64.rpm"
RPM_HASH = "5d8bc68fe7655df3a2e1785bd8cf99b9654075223806658e63a7a16a9f9b2a82519e408ca632bc26e59db870d8e93153657e2ae0fa5c22cb5fc5f4c432071223"

RPROVIDES:${PN} += "armnn-opencl"

RDEPENDS:${PN} += "libarmnn36-opencl"

inherit rpm
