SUMMARY = "Documentation for texlive-dtk-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-dtk-bibliography"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_11svn76870"

RPM_NAME = "texlive-dtk-bibliography-doc-2026.226.2025_11svn76870-59.2.noarch.rpm"
RPM_HASH = "88ee5d510fd63c9948d3ba5aefce664bd47784c5a382824c0ecb991f551348aed9563fa56cf893000cc3762e65ac14e1c8cfe8115381fecdfc1c80d2882fe84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtk-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
