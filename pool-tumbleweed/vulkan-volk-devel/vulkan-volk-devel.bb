SUMMARY = "Headers for the Vulkan meta loader"
DESCRIPTION = "Headers needed for programs to utilize the Vulkan VOLK meta loader."
LICENSE = "MIT"

PV = "1.4.341"

RPM_NAME = "vulkan-volk-devel-1.4.341-1.4.aarch64.rpm"
RPM_HASH = "6c3f36202f664d6150db2942f4107bdd207722441c05fc573b39b6b15dc07a899120e3e77233448517472e737a7bb53283ad2baefd5f3f73fcff17c85290faad"

RPROVIDES:${PN} += "cmake-volk \
vulkan-volk-devel"

RDEPENDS:${PN} += "libvolk-1-4-341"

inherit rpm
