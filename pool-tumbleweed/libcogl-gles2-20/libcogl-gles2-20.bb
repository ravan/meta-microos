SUMMARY = "OpenGL ES 2 support for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures"
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl-gles2-20-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "5b6f11db216e3d5bd3f7813847a9b74beae03710841726538ac9098ee75aa4da0f97d949b1b55ce76d5c3a3fc16ad3803640d19da18c923e85fb7d23e0ba786a"

RPROVIDES:${PN} += "libcogl-gles2-20 \
libcogl-gles2.so.20"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcogl.so.20"

inherit rpm
