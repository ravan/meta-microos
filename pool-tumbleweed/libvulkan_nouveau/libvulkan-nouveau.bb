SUMMARY = "Mesa vulkan driver for NVK (Nouveau Vulkan)"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_nouveau-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "15a0f6118999adda3e60d52791e520327732ca904cfca3c12f41822a53e6c3156cf7708e751f04d555b880a827bedc423efba0e17539730a26143c005cf59b00"

RPROVIDES:${PN} += "libvulkan-nouveau \
libvulkan-nouveau.so"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libX11-xcb.so.1 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
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
