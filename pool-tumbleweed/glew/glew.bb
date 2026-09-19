SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "glew-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "3e53f1b1fcb44c1e2736d100d8fa23929713cf02b053978ae08c5634e7566336bb7ce2043596a253a3175d7cb5056e8bb1e50ebd9d7e3fd0bea147e014572c54"

RPROVIDES:${PN} += "glew"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libc.so.6"

inherit rpm
