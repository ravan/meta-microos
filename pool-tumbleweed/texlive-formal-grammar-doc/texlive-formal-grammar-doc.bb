SUMMARY = "Documentation for texlive-formal-grammar"
DESCRIPTION = "This package includes the documentation for texlive-formal-grammar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn61955"

RPM_NAME = "texlive-formal-grammar-doc-2026.226.1.2svn61955-60.2.noarch.rpm"
RPM_HASH = "71badeb2bc19ae6a027b7c8f88237fafcf99e614766b353a9f3aec6f9240f8f0e332290554ff77722368e3c416403bcda8ce97d769f325c55a2871f8f800688b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formal-grammar-doc"

RDEPENDS:${PN} += ""

inherit rpm
