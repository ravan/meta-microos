SUMMARY = "VTK header files for building C++ code"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This provides development libraries and header files required to \
compile C++ programs that use VTK to do 3D visualisation."
LICENSE = "BSD-3-Clause"

PV = "9.6.1"

RPM_NAME = "vtk-openmpi4-devel-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "c8012fb2f2051c263fcb7fc8e936152f5f725eede2c0b461a1e1017f42d27a428875ab31be5c2147ace2ac32e16feb03a1e2dce9c8bf1446885b9658ce1f1248"

RPROVIDES:${PN} += "vtk-openmpi4-devel"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake-FastFloat \
cmake-Verdict \
cmake-nlohmann-json \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
hdf5-openmpi4-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg-devel \
libtiff-devel \
libvtk1-openmpi4 \
libvtkWrappingTools.so.1 \
openmpi4 \
openmpi4-devel \
pkgconfig-CLI11 \
pkgconfig-Qt5Core \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5OpenGLExtensions \
pkgconfig-Qt5Sql \
pkgconfig-Qt5Widgets \
pkgconfig-expat \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-jsoncpp \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libiodbc \
pkgconfig-liblz4 \
pkgconfig-liblzma \
pkgconfig-libpng \
pkgconfig-libswscale \
pkgconfig-netcdf \
pkgconfig-proj \
pkgconfig-pugixml \
pkgconfig-theora \
pkgconfig-zlib \
python3-vtk-openmpi4 \
utfcpp-devel \
vtk-openmpi4-qt"

inherit rpm
