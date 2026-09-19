SUMMARY = "Mesa vulkan driver for LVP"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_lvp-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "360e356298a0c4a6fc0de06d1da70193a920c8bca529e03970498067074b1fa05f14b494e1fa039918860c0657f039c1abec0cb99c6fe9f1ad511cae924838f2"

RPROVIDES:${PN} += "libvulkan-lvp \
libvulkan-lvp.so"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libSPIRV-Tools-2026.3~rc1.so \
libX11-xcb.so.1 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
libz.so.1"

inherit rpm
