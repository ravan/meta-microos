SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "vtk-m-openmpi4-devel-2.3.0-2.4.aarch64.rpm"
RPM_HASH = "004e8ed627c14f102bd514819ad3206aeada3674fac85126ef9b3ab938bce2388bb5024e1b2d1bd942b1815c33be6c3cbfc6c0c0aa25eebfefa5813027306c59"

RPROVIDES:${PN} += "vtk-m-openmpi4-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-openmpi4-2-3 \
openmpi4-devel"

inherit rpm
