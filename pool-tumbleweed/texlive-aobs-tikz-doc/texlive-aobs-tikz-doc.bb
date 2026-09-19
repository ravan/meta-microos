SUMMARY = "Documentation for texlive-aobs-tikz"
DESCRIPTION = "This package includes the documentation for texlive-aobs-tikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn70952"

RPM_NAME = "texlive-aobs-tikz-doc-2026.226.1.01svn70952-61.2.noarch.rpm"
RPM_HASH = "a94ed4ee60f5923204c97f95b050aba5b040d3d3d38fd9505318bc5047b52c119280850f4e112ec026e98ea73b1c60f08f993e2e9532fbd3fac7951779cfdd89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aobs-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
