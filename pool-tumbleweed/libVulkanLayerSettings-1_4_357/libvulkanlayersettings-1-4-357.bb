SUMMARY = "Utility library for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
The Vulkan::LayerSettings library standardizes layer \
configuration code for various SDK layer deliverables."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "libVulkanLayerSettings-1_4_357-1.4.357-1.1.aarch64.rpm"
RPM_HASH = "462459912ee759d7a5818740b3e137d7477a4e7185adb6882d49f56dc147fc6f7b230045c86dc7ef0c6d76971f9a0998d828fd4f120cb569cec40c495e7d1a82"

RPROVIDES:${PN} += "libVulkanLayerSettings-1-4-357 \
libVulkanLayerSettings-1.4.357.so \
libVulkanSafeStruct-1.4.357.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
