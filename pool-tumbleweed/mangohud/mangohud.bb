SUMMARY = "A Vulkan and OpenGL overlay for monitoring"
DESCRIPTION = "A Vulkan and OpenGL overlay for monitoring FPS, temperatures, CPU/GPU load and more."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "mangohud-0.8.4-1.3.aarch64.rpm"
RPM_HASH = "413881282aaf6428f4d0f69155166ceee3c31f5fc72a4dba17097b2926f8ca962846421b04e7d2a364f14a1314a05d8e78653c0bb859d04f8bb5575f451d2e63"

RPROVIDES:${PN} += "bundled-ImGui \
bundled-Vulkan-Headers-sdk \
libMangoHud-opengl.so \
libMangoHud-shim.so \
libMangoHud.so \
mangohud"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libm.so.6 \
libspdlog.so.1.17 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
