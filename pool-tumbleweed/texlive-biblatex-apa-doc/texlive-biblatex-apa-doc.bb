SUMMARY = "Documentation for texlive-biblatex-apa"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-apa"
LICENSE = "LPPL-1.0"

PV = "2026.226.9.20svn76158"

RPM_NAME = "texlive-biblatex-apa-doc-2026.226.9.20svn76158-61.2.noarch.rpm"
RPM_HASH = "82d9291914f404595c050104e2b03b7a63ea8f670e223ae32f8b2ee6a6117f9a7133d9bd70ed3aec2157f3afea54526b04c5fc3abf420b4b6b8346f318f5f19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-apa-doc"

RDEPENDS:${PN} += ""

inherit rpm
