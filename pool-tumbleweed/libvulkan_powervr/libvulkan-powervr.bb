SUMMARY = "Mesa vulkan driver for PowerVR"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_powervr-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "e9c1806d5ff3142a0ad8f917725b24d364c05569e7bfadb24f459f3370c45db51dbe62b01deb28763b6258538a0c07d7e7433a1f0226c58725b153da8b76c2e2"

RPROVIDES:${PN} += "libvulkan-powervr \
libvulkan-powervr-mesa.so"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libX11-xcb.so.1 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libexpat.so.1 \
libm.so.6 \
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
