SUMMARY = "Development package for libnvidia-egl-x11"
DESCRIPTION = "This is an EGL platform library for the NVIDIA driver to support XWayland via \
xlib (using EGL_KHR_platform_x11) or xcb (using EGL_EXT_platform_xcb). \
 \
In addition, this library depends on a (still somewhat experimental) interface \
in the NVIDIA driver, which is supported only in 560 or later series drivers. \
 \
For full functionality, it also needs the explicit sync protocol added to \
version 1.4 of the Present and DRI3 extensions, which is available in XWayland \
24.1 and later. Without explicit sync support, you may get reduced performance \
and out-of-order frames. \
 \
This package provides headers and libraries required to build software \
using libnvidia-egl-x11."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "libnvidia-egl-x11-devel-1.0.6-1.1.aarch64.rpm"
RPM_HASH = "52c5be3ae95cda1b70ec931f46b2d65362dc0c09345118f18a944759733a7e0007b25fae572da78da033af45d8e192602dfe00fb785183b51d5defc5e3aa2e5e"

RPROVIDES:${PN} += "libnvidia-egl-x11-devel"

RDEPENDS:${PN} += "libnvidia-egl-x111"

inherit rpm
