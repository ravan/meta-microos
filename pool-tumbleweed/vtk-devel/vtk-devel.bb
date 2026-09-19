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

RPM_NAME = "vtk-devel-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "6fae61b266296ed3e8b8116fe6f123785c2520ab346dc7655a5ac937548e269dbbc8a1782ce35053f754b66b973b5a19e0c2d6d03c1c39520a6b7d255a7da657"

RPROVIDES:${PN} += "cmake-FindFont \
cmake-vtk \
vtk-devel"

RDEPENDS:${PN} += "cgns-devel \
cmake \
cmake-FastFloat \
cmake-Verdict \
cmake-nlohmann-json \
double-conversion-devel \
gcc-c++ \
gl2ps-devel \
hdf5-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg-devel \
libtiff-devel \
libvtk1 \
libvtkWrappingTools.so.1 \
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
python3-vtk \
utfcpp-devel \
vtk-qt"

inherit rpm
