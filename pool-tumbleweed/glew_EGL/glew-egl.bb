SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "glew_EGL-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "f7936d8ddea4698dd7c305646df217f7bfc60e59dc6eb42755b6e082f4a02b11f963ddb4a3ce66f2e6dc9db458239fe12d8ebaf60e78c7f80fd0ff95760884f2"

RPROVIDES:${PN} += "glew-EGL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLEW-EGL.so.2.3 \
libc.so.6"

inherit rpm
