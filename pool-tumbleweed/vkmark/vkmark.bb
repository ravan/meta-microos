SUMMARY = "Vulkan benchmark utility"
DESCRIPTION = "An extensible Vulkan benchmarking suite with targeted, configurable scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2025.01+git.20250909"

RPM_NAME = "vkmark-2025.01+git.20250909-1.3.aarch64.rpm"
RPM_HASH = "9db0fc24fc365c486889c4f7d054872266d5236a14ea797e191f64265f262e7f7e47b7cfd29f2ec86698cc6754ff9d28bc9c7a44b0256936bdd8202020a702cf"

RPROVIDES:${PN} += "vkmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassimp.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb-icccm.so.4 \
libxcb.so.1"

inherit rpm
