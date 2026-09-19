SUMMARY = "Documentation for texlive-digiconfigs"
DESCRIPTION = "This package includes the documentation for texlive-digiconfigs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-digiconfigs-doc-2026.226.0.0.5svn15878-59.2.noarch.rpm"
RPM_HASH = "95e3d22099022e63181dd50dc45a1b225ee8b8d22cdc619d060c4a65fc7f7561e7e88bc4663188c531f60bbb0d75359794ad681aa1d83be9b1e2bbbbc4487a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digiconfigs-doc"

RDEPENDS:${PN} += ""

inherit rpm
