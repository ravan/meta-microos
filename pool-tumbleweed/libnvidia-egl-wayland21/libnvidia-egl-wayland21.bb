SUMMARY = "Dma-buf-based Wayland external platform library"
DESCRIPTION = "This is a new implementation of the EGL External Platform Library for Wayland \
(EGL_KHR_platform_wayland), using the NVIDIA driver's new platform surface \
interface, which simplifies a lot of the library and improves window resizing."
LICENSE = "Apache-2.0 & GPL-2.0"

PV = "1.0.2~20260716git2023f59"

RPM_NAME = "libnvidia-egl-wayland21-1.0.2~20260716git2023f59-1.1.aarch64.rpm"
RPM_HASH = "0b701eea6cda12a9d2c9bf6a1ad658cf2629a8ba383890cb3c8b88e7fe6d0cbe6e0c65af07584006861770986815e161b45ed49deae0b49218d86cbf77ae6de1"

RPROVIDES:${PN} += "libnvidia-egl-wayland2.so.1 \
libnvidia-egl-wayland21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libwayland-client.so.0"

inherit rpm
