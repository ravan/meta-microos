SUMMARY = "Documentation for texlive-shapepar"
DESCRIPTION = "This package includes the documentation for texlive-shapepar"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-shapepar-doc-2026.226.2.2svn77682-60.2.noarch.rpm"
RPM_HASH = "f00ac57352185a639ff1912bd13d7bf3e9b7b70b9b5f1b8ab6bdd6d7c361e616955dc97cda9692fbee8f8b8ae7ed332543dc37873b82870aa341ee78292a5798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapepar-doc"

RDEPENDS:${PN} += ""

inherit rpm
