SUMMARY = "Validation layers for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API. \
 \
This package contains the Khronos official Vulkan validation layers."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "vulkan-validationlayers-1.4.357-1.1.aarch64.rpm"
RPM_HASH = "499a9839c03c98887028ad7b3fc29268069a6bf26ff4079700b734b2e7f908017b33c786b99f2e509eed8e0d85bbbd3b6a01726778624b9eb66f2b496f5cab31"

RPROVIDES:${PN} += "libVkLayer-khronos-validation.so \
vulkan-validationlayers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libVulkanLayerSettings-1.4.357.so \
libVulkanSafeStruct-1.4.357.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
