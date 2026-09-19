SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libGL-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "66a2f128f6f06d98bddfacda02c30fa9f6c03d3be7e498f3871ffd1339c6dcd531d1b112cab80197dd7eb111cf54e0c2fc211a6b9f51f61f85a342722a521141"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
