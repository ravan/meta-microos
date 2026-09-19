SUMMARY = "Mesa vulkan driver for Broadcom"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_broadcom-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "df195cc0ff7f4037803d2fa50e8577b4e7aea5f8de94db422746064bc99c24a1b2133ea82fd0959838f8ad6efcafc606779bb3c0bb9364117dfdcb7faab08f94"

RPROVIDES:${PN} += "libvulkan-broadcom \
libvulkan-broadcom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
