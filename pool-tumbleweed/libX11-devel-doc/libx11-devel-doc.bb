SUMMARY = "Manual pages for libX11"
DESCRIPTION = "Manual pages for the C API of libX11."
LICENSE = "MIT"

PV = "1.8.13"

RPM_NAME = "libX11-devel-doc-1.8.13-1.4.noarch.rpm"
RPM_HASH = "4ec59cd398c9ffd22f8fa02c43ebffd49771ba77cc234be9fa26d2fc89200c86a0b22c5ffa29d02c8639d79531bc4453a10933083d74bc2c9175c09fa5203645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libX11-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
