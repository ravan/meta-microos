SUMMARY = "Documentation for texlive-diadia"
DESCRIPTION = "This package includes the documentation for texlive-diadia"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn37656"

RPM_NAME = "texlive-diadia-doc-2026.226.1.1svn37656-59.2.noarch.rpm"
RPM_HASH = "47917d60b905ae423604704160e11ffda6e29308c0c2382da08d5eb881c8b83cf5b187caa08a82713eb97d8de6a51a83914df0ab2ad510751d223cfd1359cf12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-doc"

RDEPENDS:${PN} += ""

inherit rpm
