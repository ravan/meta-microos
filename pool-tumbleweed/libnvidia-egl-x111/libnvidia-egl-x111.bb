SUMMARY = "NVIDIA XLib and XCB EGL Platform Library"
DESCRIPTION = "This is an EGL platform library for the NVIDIA driver to support XWayland via \
xlib (using EGL_KHR_platform_x11) or xcb (using EGL_EXT_platform_xcb). \
 \
In addition, this library depends on a (still somewhat experimental) interface \
in the NVIDIA driver, which is supported only in 560 or later series drivers. \
 \
For full functionality, it also needs the explicit sync protocol added to \
version 1.4 of the Present and DRI3 extensions, which is available in XWayland \
24.1 and later. Without explicit sync support, you may get reduced performance \
and out-of-order frames."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "libnvidia-egl-x111-1.0.6-1.1.aarch64.rpm"
RPM_HASH = "9c5daabc1552d773ad10b61f055297757ac9bb20f2a04189b22a3860b0836d0c6fb21bc9dd088d19b6ef328d4da2f824a8abb74cfe72691699167ff59e69ea6f"

RPROVIDES:${PN} += "libnvidia-egl-x111 \
libnvidia-egl-xcb.so.1 \
libnvidia-egl-xlib.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb.so.1"

inherit rpm
