SUMMARY = "ICC + CGATS icon"
DESCRIPTION = "The ICC profile and CGATS mime types and a icon for these file types."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-mime-types-1.2-16.29.noarch.rpm"
RPM_HASH = "a2b9eb6561db32aef81fabd143cce6a7d5743039ebbbefa781f5ee7a51c3c42f463f3325bffb77be7de17d67b15013bc90b99cf0d50892071787a61ee73ed35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-mime-types"

RDEPENDS:${PN} += ""

inherit rpm
