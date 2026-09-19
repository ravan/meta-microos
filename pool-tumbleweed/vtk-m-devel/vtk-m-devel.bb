SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "vtk-m-devel-2.3.0-2.4.aarch64.rpm"
RPM_HASH = "02b980f886fee01e4172067aed763a984091d42f790f9b83a11215eddf3af87489c3e0630dd0ef467aeba428f64934ef9f1fa133287161786482042b75682351"

RPROVIDES:${PN} += "cmake-VTKm \
vtk-m-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-2-3"

inherit rpm
