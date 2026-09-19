SUMMARY = "Vulkan C and C++ API header files"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "vulkan-headers-1.4.357-1.1.noarch.rpm"
RPM_HASH = "93c486a4b7f637f023381bc67a826320d28fe9d589c2285957983b343ea57f91dd074a4890f02b6d288f22e91719ae8899997fd70b11fbd2816b65bc9080bd21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-VulkanHeaders \
vulkan-headers"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
pkgconfig-wayland-client \
pkgconfig-x11 \
pkgconfig-xcb \
pkgconfig-xrandr"

inherit rpm
