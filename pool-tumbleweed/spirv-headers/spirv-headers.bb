SUMMARY = "Machine-readable files from the SPIR-V registry"
DESCRIPTION = "This repository contains machine-readable files from the SPIR-V \
registry. This includes: \
 \
* Header files for various languages. \
* JSON files describing the grammar for the SPIR-V core instruction \
  set, and for the GLSL.std.450 extended instruction set. \
* The XML registry file."
LICENSE = "MIT"

PV = "1.202609.0"

RPM_NAME = "spirv-headers-1.202609.0-1.1.noarch.rpm"
RPM_HASH = "c38e18a4dd8fbf97b9536a3afa4d47d26df346d8c95962e966ccc9652b9a9e7e837b4942751cd18f8f63d7a37d68d0f7db0162fb0b258237088a88735cf3cffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-SPIRV-Headers \
pkgconfig-SPIRV-Headers \
spirv-headers"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
