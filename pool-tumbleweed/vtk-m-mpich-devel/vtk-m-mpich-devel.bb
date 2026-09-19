SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) development libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This provides development libraries and header files required to compile C++ \
programs that use VTK-m to do 3D visualization."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "vtk-m-mpich-devel-2.3.0-2.3.aarch64.rpm"
RPM_HASH = "3dba87ee4ca2dac1e164ae134eaccda854e08b03e028e790f49e62fe6ca5f70d17d54c834ad6c6c1e94d3fb6da37729179228e85dc1fcb9fdf27e0b4b71dc69b"

RPROVIDES:${PN} += "vtk-m-mpich-devel"

RDEPENDS:${PN} += "cmake \
libvtk-m-mpich-2-3 \
mpich-devel"

inherit rpm
