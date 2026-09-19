SUMMARY = "Mesa demo programs for the OpenGL stack"
DESCRIPTION = "Mesa is a 3-D graphics library with an API similar to OpenGL. \
This package contains the demos shipped with Mesa."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-9.0.0-7.5.aarch64.rpm"
RPM_HASH = "d8b5e0afdfbae6acc6bca7ef891dd40e47caa7225fd7ea282d0cb099af031dccd5fd13a78d91117cd46c8bf102a2766f28bf488c29e0c26e979c7b86cf54d16b"

RPROVIDES:${PN} += "Mesa-demo"

RDEPENDS:${PN} += "Mesa-demo-egl \
Mesa-demo-es \
Mesa-demo-x \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libdecor-0.so.0 \
libglut.so.3 \
libm.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
