SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-vulkan-overlay-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "0b179c24690dfeacd38007719a394c38bacea9814c2c30277f7e59870898a3627c30458f4494ad168776f83821f6540e5e94208fe609c6ab9f27cda04ef3f808"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
