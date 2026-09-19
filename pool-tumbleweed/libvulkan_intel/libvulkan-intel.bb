SUMMARY = "Mesa vulkan driver for Intel GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_intel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "b64da78d7e391d85edce5607c6a8b39bd1faca7085b9cbd56e14bb3ad759c80f1bc28d8ffc0acdfb05f863bfb65af669f9c05f727fa41988e0526b3d2729891c"

RPROVIDES:${PN} += "Mesa-libVulkan-devel \
libvulkan-intel \
libvulkan-intel-hasvk.so \
libvulkan-intel.so"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1 \
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
