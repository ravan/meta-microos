SUMMARY = "Development files for glew"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "glew_EGL-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "c9bd10dafabc4c07e27956a8ce4467beaaa2c96a334d1aa56163335fa75a287600428ebb863d766b330294669aa1fac302aeafba664c9bec6fef2701b4f4f519"

RPROVIDES:${PN} += "cmake-glew \
glew-EGL-devel \
pkgconfig-glew"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLEW-EGL2-3 \
pkgconfig-egl \
pkgconfig-glu"

inherit rpm
