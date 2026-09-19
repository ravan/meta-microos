SUMMARY = "Vulkan Development"
DESCRIPTION = "Tools and libraries for software development using Vulkan."
LICENSE = "MIT"

PV = "20221115"

RPM_NAME = "patterns-devel-vulkan-devel_vulkan-20221115-2.10.aarch64.rpm"
RPM_HASH = "2c0030d85e2d0e9b6abb24c9e6b25e03af81d122be51312ec64b05a1b6a38b450b33ba3a0d754d052e4fa2eafdf4353fdb99164e4a2ebfc0a2006555803c657e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-vulkan-devel-vulkan"

RDEPENDS:${PN} += ""

inherit rpm
