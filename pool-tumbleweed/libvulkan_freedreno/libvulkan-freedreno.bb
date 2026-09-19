SUMMARY = "Mesa vulkan driver for Freedreno"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libvulkan_freedreno-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "a2d1496f9da4daca79b5258ccfabd60d7ebc5e0d0d7a24a8979683c3886b2cba18744c5477dbbc4c76a4632954d7bc8d529e95775989bd476f89041eef980d6c"

RPROVIDES:${PN} += "libvulkan-freedreno \
libvulkan-freedreno.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libX11-xcb.so.1 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libexpat.so.1 \
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
