SUMMARY = "Xt OpenGL drawing area widget library"
DESCRIPTION = "Xt OpenGL drawing area widget library shipped by the Mesa Project."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libGLw1-8.0.0-7.13.aarch64.rpm"
RPM_HASH = "52fbd471a200c0a5f295ed81bd315cd235a3e3f97cc733e4a3fc1b858a25c47809760a152d6909ae5f44a09bdc4ff6c14a4d39c30f965d99d9cd8b87eed1cf3c"

RPROVIDES:${PN} += "GLw1 \
MesaGLw \
libGLw.so.1 \
libGLw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
