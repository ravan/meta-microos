SUMMARY = "Arm NN SDK enables machine learning workloads on power-efficient devices"
DESCRIPTION = "Arm NN is an inference engine for CPUs, GPUs and NPUs. \
It bridges the gap between existing NN frameworks and the underlying IP. \
It enables efficient translation of existing neural network frameworks, \
such as TensorFlow Lite, allowing them to run efficiently – without \
modification – across Arm Cortex CPUs and Arm Mali GPUs."
LICENSE = "MIT"

PV = "26.07"

RPM_NAME = "armnn-26.07-1.1.aarch64.rpm"
RPM_HASH = "ed05480c2e4d81c7af81741bfe50d1ef3a8b603ea5371e304b5487bf5b1bbb673090cfa6c7db063773fc827ee8f0c3da8c5161089d842a016f10cb08f46607ae"

RPROVIDES:${PN} += "armnn"

RDEPENDS:${PN} += "libarmnn36"

inherit rpm
