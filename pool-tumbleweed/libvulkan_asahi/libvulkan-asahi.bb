SUMMARY = "Mesa vulkan driver for Asahi (Apple Silicon)"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_asahi-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "bbddb7329a7a1526f67b692acf2e6aa4440ce07d791b9aa459dfcf166dbb4f6e231199bb8fc21f3db952867614255b9046e7f8385d56b3a5c1c3702e5d4d5542"

RPROVIDES:${PN} += "libvulkan-asahi \
libvulkan-asahi.so"

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
