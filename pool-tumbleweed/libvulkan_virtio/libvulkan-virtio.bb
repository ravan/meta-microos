SUMMARY = "Mesa vulkan driver for Virtio-GPU (Venus)"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_virtio-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "8a2d4b59841348664f4745dd2e3b3d9c03b28dd5680a0a4738d6b1d52cca826929870440820937815c21bcc591cbf54eba75f00bf7624871a12743835e30c734"

RPROVIDES:${PN} += "libvulkan-virtio \
libvulkan-virtio.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
