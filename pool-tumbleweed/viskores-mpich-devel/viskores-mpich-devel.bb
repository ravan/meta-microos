SUMMARY = "Visualization Kernels for Rendering and Simulation development libraries"
DESCRIPTION = "Viskores is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use Viskores to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "viskores-mpich-devel-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "6cb55b2efa119152235cf086376797ce94f5f8ecb933eb9571c4d347c990d050363f5d9a9adc32f63724561d8041c6d05cc20690ce422087086f5a1fbb95b31a"

RPROVIDES:${PN} += "viskores-mpich-devel"

RDEPENDS:${PN} += "cmake \
libviskores-mpich-1-1 \
mpich-devel"

inherit rpm
