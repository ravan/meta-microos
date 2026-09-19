SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "libGLEW_EGL2_3-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "883c58de9957030ba0d1427399289ce115610df891eee9542eb03de1fd6c18bca0109032c6536b785c0de9a23c787b0cf8190523b07e188502fc947cd12c4a06"

RPROVIDES:${PN} += "libGLEW-EGL.so.2.3 \
libGLEW-EGL2-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libc.so.6"

inherit rpm
