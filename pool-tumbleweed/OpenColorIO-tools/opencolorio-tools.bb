SUMMARY = "Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.5.2"

RPM_NAME = "OpenColorIO-tools-2.5.2-1.2.aarch64.rpm"
RPM_HASH = "04fa41658ce5b7c1d0bc9c39a23c193fcc2f611cfa465e2b588991ecfcb003a063d9fc63fb590533a087c21aef237578471b52268c95dc2b631bda790e22c821"

RPROVIDES:${PN} += "OpenColorIO-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libGLU.so.1 \
libGLX.so.0 \
libOpenColorIO.so.2.5 \
libOpenEXR-3-4.so.33 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
liblcms2.so.2 \
libm.so.6 \
libminizip-ng.so.4 \
libpystring.so.0.0 \
libstdc++.so.6"

inherit rpm
