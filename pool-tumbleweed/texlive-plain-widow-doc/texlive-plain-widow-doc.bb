SUMMARY = "Documentation for texlive-plain-widow"
DESCRIPTION = "This package includes the documentation for texlive-plain-widow"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn75230"

RPM_NAME = "texlive-plain-widow-doc-2026.226.1.0svn75230-58.2.noarch.rpm"
RPM_HASH = "075d0edd71def8295004d991953187a7e1a2028fcf001293c74b8fa69eb17ad26fbcc8186955394aeab4e3e1fb225483bac7b856a4c214bb66ac57c1c97262d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plain-widow-doc"

RDEPENDS:${PN} += ""

inherit rpm
