SUMMARY = "Vulkan development package"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This subpackage contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "vulkan-devel-1.4.357-1.1.aarch64.rpm"
RPM_HASH = "8a2c20afe33faf3e942da92635d72e0f66192a99da1c7ca7169933c90b0939f2948f241577de8c705bbc110211239ff170285653dbaa00e9ab3553b0c1c34d76"

RPROVIDES:${PN} += "cmake-VulkanLoader \
pkgconfig-vulkan \
vulkan-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvulkan1 \
vulkan-headers"

inherit rpm
