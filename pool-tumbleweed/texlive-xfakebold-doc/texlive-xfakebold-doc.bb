SUMMARY = "Documentation for texlive-xfakebold"
DESCRIPTION = "This package includes the documentation for texlive-xfakebold"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn77682"

RPM_NAME = "texlive-xfakebold-doc-2026.226.0.0.10svn77682-59.4.noarch.rpm"
RPM_HASH = "9562c34df7553ddb126c4d3082e54399ea4ac880fb1b5e9a4fa602d1bf939d59d39fe42ccc40b047228c5408406fdbb0059017c4070df33fbc2657aa8203586b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfakebold-doc"

RDEPENDS:${PN} += ""

inherit rpm
