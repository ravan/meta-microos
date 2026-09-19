SUMMARY = "Faroe Island datum grids for Proj"
DESCRIPTION = "Faroe Island datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-fo-9.8.1-2.3.noarch.rpm"
RPM_HASH = "9b2df68c2914a7c3ee70ec8c885e7936c55b63d6b978796c6348ebace51c3bf402223cbaf08c51837e5fc8952fced503b639b85a45b9ef97104fa91175020899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fo"

RDEPENDS:${PN} += ""

inherit rpm
