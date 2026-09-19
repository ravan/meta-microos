SUMMARY = "Portugal datum grids for Proj"
DESCRIPTION = "Portugal datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-pt-9.8.1-2.3.noarch.rpm"
RPM_HASH = "7196549845064fd9491fa75005ba66d7cf5efe7441d46e3f914caed0c00d15ef9fa273245b12e2d45ab3e58f164e3d08a9d6e86208ed14b656f6122f43afef17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-pt"

RDEPENDS:${PN} += ""

inherit rpm
