SUMMARY = "Documentation for texlive-alpha-persian"
DESCRIPTION = "This package includes the documentation for texlive-alpha-persian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76790"

RPM_NAME = "texlive-alpha-persian-doc-2026.226.1.3svn76790-61.2.noarch.rpm"
RPM_HASH = "1d2637e2b408c626c16ceeb4d21ef3b4c1ca3827949c0461c4a696069a654eb90f0ffae8872331c49db571b1fc3851bc7b4e3518ca69383321a97d0710f293b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-alpha-persian-doc-fa \
texlive-alpha-persian-doc"

RDEPENDS:${PN} += ""

inherit rpm
