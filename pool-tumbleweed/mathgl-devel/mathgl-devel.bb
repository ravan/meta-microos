SUMMARY = "Libraries and header files for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains libraries and header files for developing \
applications that use MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-devel-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "3b651aac4beedd4a0c816fa34709a3c917986883aeb22f614ca606e8cfd910ed1bc0cbf74fc61ebc8cb43739f2745ac02a79dc51ba15878cf413ab72d97d1ed8"

RPROVIDES:${PN} += "cmake-MathGL2 \
cmake-mathgl2 \
mathgl-devel"

RDEPENDS:${PN} += "cmake \
libmgl-fltk8 \
libmgl-glut8 \
libmgl-mpi8 \
libmgl-qt-8 \
libmgl-wnd8 \
libmgl-wx8 \
libmgl8"

inherit rpm
