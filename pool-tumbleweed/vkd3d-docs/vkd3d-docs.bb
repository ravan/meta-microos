SUMMARY = "Documentation for vkd3d"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "vkd3d-docs-2.0-1.5.noarch.rpm"
RPM_HASH = "dcb356a3dd5a4313dc3a6b5edddfec0a5a38d3504f06a17b83cb784da86e270b7ee116d9af0884931f78b98d89b3ca62306a063d179167f5d456c2a4a775a5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vkd3d-docs"

RDEPENDS:${PN} += ""

inherit rpm
