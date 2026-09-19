SUMMARY = "Hyprland plugin: csgo-vulkan-fix"
DESCRIPTION = "Plugins allow users to add extra functionality to Hyprland. \
 \
This fixes custom resolutions on CS:GO with -vulkan"
LICENSE = "BSD-3-Clause"

PV = "0.56.0"

RPM_NAME = "hyprland-plugin-csgo-vulkan-fix-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "aaafe457569506c7aca2f3b93a434452ab3a21139d16a22db6f184fdd51682711f846cb4a6a560e0e2d7121cd5f4a4c2b9f6674b4fb8f7c1de1ebfafc02b88b1"

RPROVIDES:${PN} += "hyprland-plugin-csgo-vulkan-fix"

RDEPENDS:${PN} += "hyprland \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
