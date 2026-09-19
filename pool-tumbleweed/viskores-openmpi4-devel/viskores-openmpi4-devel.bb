SUMMARY = "Visualization Kernels for Rendering and Simulation development libraries"
DESCRIPTION = "Viskores is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use Viskores to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "viskores-openmpi4-devel-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "f94037e834587c9cd221df833655adb79ece223402428d6c58a6fd65538e6a24e61610271870601db6b651ab711a944b816480cef8a5507507c62880e4fa004c"

RPROVIDES:${PN} += "viskores-openmpi4-devel"

RDEPENDS:${PN} += "cmake \
libviskores-openmpi4-1-1 \
openmpi4-devel"

inherit rpm
