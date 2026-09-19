SUMMARY = "Vulkan layer for runtime color grading on Linux"
DESCRIPTION = "vkSumi is a Vulkan implicit layer that provides runtime color grading \
for Vulkan applications and games on Linux. \
 \
The layer is enabled by setting ENABLE_VKSUMI=1 before launching a \
Vulkan application."
LICENSE = "MIT"

PV = "0.0.7"

RPM_NAME = "vkSumi-0.0.7-1.3.aarch64.rpm"
RPM_HASH = "85f3d67d342c2775da909b70b295a08d3b13735acd52729c9ef623ca70c66746db8c1812b34323993e8c69d6810cfd0611ce6699057221745493b08eeffde9b4"

RPROVIDES:${PN} += "libVkLayer-vksumi.so \
vkSumi"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
