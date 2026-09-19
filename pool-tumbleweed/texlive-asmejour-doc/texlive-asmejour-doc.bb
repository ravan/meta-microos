SUMMARY = "Documentation for texlive-asmejour"
DESCRIPTION = "This package includes the documentation for texlive-asmejour"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.27svn77682"

RPM_NAME = "texlive-asmejour-doc-2026.226.1.27svn77682-60.2.noarch.rpm"
RPM_HASH = "3b2b65300f74c4fb51260fd322373c1a0260d9e2aa81885ba35be3baf1dc6299fc0b4f35f95fba57beb59b12bb3d7b00a0db1a0237cb11f057248689d9f6b5d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asmejour-doc"

RDEPENDS:${PN} += ""

inherit rpm
