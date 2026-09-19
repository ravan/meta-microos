SUMMARY = "Libraries, includes and more to develop libdrm applications"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers. \
 \
This package contains the development headers for the library found \
in libdrm2."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm-devel-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "2e86e0820c68eb307cd5f689d6a2715090452e0b2637b537424f3d9c5af76bab57740db683f6f2b8122a45cd2690b5d9f7091baa89d3490f82034915e73ca0b9"

RPROVIDES:${PN} += "libdrm-devel \
libkms-devel \
pkgconfig-libdrm \
pkgconfig-libdrm-amdgpu \
pkgconfig-libdrm-etnaviv \
pkgconfig-libdrm-exynos \
pkgconfig-libdrm-freedreno \
pkgconfig-libdrm-intel \
pkgconfig-libdrm-nouveau \
pkgconfig-libdrm-radeon \
pkgconfig-libdrm-tegra \
pkgconfig-libdrm-vc4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdrm-amdgpu1 \
libdrm-etnaviv1 \
libdrm-exynos1 \
libdrm-freedreno1 \
libdrm-intel1 \
libdrm-nouveau2 \
libdrm-radeon1 \
libdrm-tegra0 \
libdrm2 \
pkgconfig-libdrm \
pkgconfig-pciaccess"

inherit rpm
