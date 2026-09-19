SUMMARY = "Documentation for texlive-coverpage"
DESCRIPTION = "This package includes the documentation for texlive-coverpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn63509"

RPM_NAME = "texlive-coverpage-doc-2026.226.1.01svn63509-61.2.noarch.rpm"
RPM_HASH = "b1013fbdd024fc9c7bdffd34a7247a2d6567cf7641cd2cf738cad9675244b402c06fa5a488c183bc80511a9db3e1f6aa6fea2e7b3f7adcb8a097632b5c39de1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coverpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
