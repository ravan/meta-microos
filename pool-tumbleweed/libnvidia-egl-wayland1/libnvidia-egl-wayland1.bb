SUMMARY = "The EGLStream-based Wayland external platform"
DESCRIPTION = "This is an implementation of a EGL External Platform library to add client-side \
Wayland support to EGL on top of EGLDevice and EGLStream families of extensions. \
 \
This library implements an EGL External Platform interface to work along with \
EGL drivers that support the external platform mechanism."
LICENSE = "MIT"

PV = "1.1.22"

RPM_NAME = "libnvidia-egl-wayland1-1.1.22-2.1.aarch64.rpm"
RPM_HASH = "c9f49dd5dcc58f276ccae091a025deaa58566094fc2da1f702e65a73170a3053ca0dddcb60a250b0f422235e1a8126de9a9144c1a44bec571e0b946578145994"

RPROVIDES:${PN} += "libnvidia-egl-wayland.so.1 \
libnvidia-egl-wayland1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
