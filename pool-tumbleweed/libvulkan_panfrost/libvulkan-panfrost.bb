SUMMARY = "Mesa vulkan driver for ARM Mali"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_panfrost-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "abfad8970b40907813d66bf8e3fdd744c0599f57f02644eac923bf423ebb7f9d43768a83a422b6e500591157ed69a327cf1568962baf02fae903f9ac7881906c"

RPROVIDES:${PN} += "libvulkan-panfrost \
libvulkan-panfrost.so"

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
