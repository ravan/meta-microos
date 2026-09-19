SUMMARY = "Development files for glew"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "glew-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "ecae5d044590bc8d6d63af92e9531dc62758d531dadb1d1e143a5de2ecaa18433112814fa21d1682c8b68c4665a32b76d5cbe6223dd9d3489d81f736cda0aa63"

RPROVIDES:${PN} += "cmake-glew \
glew-devel \
pkgconfig-glew"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLEW2-3 \
pkgconfig-glu \
pkgconfig-x11 \
pkgconfig-xau \
pkgconfig-xcb"

inherit rpm
