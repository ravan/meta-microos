SUMMARY = "Documentation for texlive-gs1"
DESCRIPTION = "This package includes the documentation for texlive-gs1"
LICENSE = "LPPL-1.0"

PV = "2026.226.23svn76924"

RPM_NAME = "texlive-gs1-doc-2026.226.23svn76924-60.4.noarch.rpm"
RPM_HASH = "c884093498bd0ae56577c216d51a3723eac16a3d770bedd8dbd7e6b0e73697f24ef95a20efab5c1ed283c3537ef2174b8a1350b4b6300c92806cfba3542501d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gs1-doc"

RDEPENDS:${PN} += ""

inherit rpm
