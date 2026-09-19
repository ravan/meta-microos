SUMMARY = "Visualization Kernels for Rendering and Simulation development libraries"
DESCRIPTION = "Viskores is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use Viskores to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "viskores-devel-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "fd7717d0a66d0a730e8478d2f4a5a71a49ab4297ab7b3ae0dfbeba214f7c41d1a67e64d326d4782d44016f35a5ac260f7a0934b1f39f1a135ced632546e3aa22"

RPROVIDES:${PN} += "cmake-Viskores \
pkgconfig-viskores \
viskores-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libviskores-1-1"

inherit rpm
