SUMMARY = "Utility library for Vulkan"
DESCRIPTION = "The Vulkan::LayerSettings library standardizes layer \
configuration code for various SDK layer deliverables. \
 \
This package contains the headers and build system integration."
LICENSE = "Apache-2.0"

PV = "1.4.357"

RPM_NAME = "vulkan-utility-libraries-devel-1.4.357-1.1.aarch64.rpm"
RPM_HASH = "be044d5728d046f2fab4b92f47cb4600a5cb6501d214114d9ac56c36d2f84a30965656c1ebe14ae184ceabc0cd1592c7fffd4a61b3608c932fcc5984961615bb"

RPROVIDES:${PN} += "cmake-VulkanUtilityLibraries \
vulkan-utility-libraries-devel"

RDEPENDS:${PN} += "libVulkanLayerSettings-1-4-357"

inherit rpm
