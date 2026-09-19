SUMMARY = "The Vulkan 3D graphics and compute API"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "libvulkan1-1.4.357-1.1.aarch64.rpm"
RPM_HASH = "e835a3e9f068e382374458eb4a193e08b99d8abb6baed0cb75b026660ddafe9c8907b7b5793e572c19717dcba391769c687b0cea37607d17de66b2c15703bb80"

RPROVIDES:${PN} += "libvulkan.so.1 \
libvulkan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
