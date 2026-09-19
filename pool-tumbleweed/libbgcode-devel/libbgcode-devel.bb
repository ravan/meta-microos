SUMMARY = "Prusa Block & Binary G-code reader / writer / converter development files"
DESCRIPTION = "Files required to develop applications using libbgcode, the \
Prusa Block & Binary G-code reader / writer / converter library"
LICENSE = "AGPL-3.0-only"

PV = "0.2.0+git20240829.b5c57c4"

RPM_NAME = "libbgcode-devel-0.2.0+git20240829.b5c57c4-2.4.aarch64.rpm"
RPM_HASH = "509efb6a364f35e662de977b454947007216388a36f9ad73d0ce472361aa400611e37f371277b4a82d48f47b676f89398a06b553d73d3c700aa607ce15450362"

RPROVIDES:${PN} += "cmake-LibBGCode \
libbgcode-devel"

RDEPENDS:${PN} += "libbgcode \
libbgcode-binarize0-2-0 \
libbgcode-convert0-2-0 \
libbgcode-core0-2-0"

inherit rpm
