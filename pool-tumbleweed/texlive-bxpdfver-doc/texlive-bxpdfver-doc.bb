SUMMARY = "Documentation for texlive-bxpdfver"
DESCRIPTION = "This package includes the documentation for texlive-bxpdfver"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8asvn74105"

RPM_NAME = "texlive-bxpdfver-doc-2026.226.0.0.8asvn74105-59.2.noarch.rpm"
RPM_HASH = "9f8e1064079e7607436a15e296efe6971e486371d007facf3e31acfc54bd9162d7202aab32e874a04b48397e6d707623b687aa8abf9e0a58cec865bac5b67e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxpdfver-doc-ja \
texlive-bxpdfver-doc"

RDEPENDS:${PN} += ""

inherit rpm
