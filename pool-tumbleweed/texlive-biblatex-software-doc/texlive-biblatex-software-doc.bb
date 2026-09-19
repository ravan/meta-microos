SUMMARY = "Documentation for texlive-biblatex-software"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-software"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2_8svn77180"

RPM_NAME = "texlive-biblatex-software-doc-2026.226.1.2_8svn77180-61.2.noarch.rpm"
RPM_HASH = "8a6af2005a144a664c1caf14df98d8cf26cb7157cf911a935347c02d16a93f8cfd89b05f4b789dfc75ff1eb38998e8c8a444cd4fbc82e1105d065fd7b5f5c020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-software-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
