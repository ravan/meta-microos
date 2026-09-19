SUMMARY = "EGL API implementation"
DESCRIPTION = "This package contains the EGL native platform graphics interface \
library. EGL provides a platform-agnostic mechanism for creating \
rendering surfaces for use with other graphics libraries, such as \
OpenGL|ES and OpenVG. \
 \
This package contains modules to interface with the existing system \
GLX or DRI2 drivers to provide OpenGL via EGL. The Mesa main package \
provides drivers to provide hardware-accelerated OpenGL|ES and OpenVG \
support."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libEGL1-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "c48263143e08a9966de5b3aa144573fd5befc8710a0c214552125a1e5a8e6f116e4c4f8894b7db83a2ac9c6d631ed14ef3a5c9358a63ed985a0d9481dccd0447"

RPROVIDES:${PN} += "Mesa-libEGL1 \
libEGL-mesa.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgallium-26.2.2.so \
libgbm.so.1 \
libglvnd \
libm.so.6 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
