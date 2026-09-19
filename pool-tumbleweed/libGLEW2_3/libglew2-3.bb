SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "libGLEW2_3-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "7eb998e3fd25f77c0bebab0f11feeeb49a4d8cc9784f155635dbda64f4b22df2c0e49e3e91930fdbd9e5aed538f5c9b6bb48dded45174555e8dd2fa71f7f612b"

RPROVIDES:${PN} += "libGLEW.so.2.3 \
libGLEW2-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLX.so.0 \
libc.so.6"

inherit rpm
