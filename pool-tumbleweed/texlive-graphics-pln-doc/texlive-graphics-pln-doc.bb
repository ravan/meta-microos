SUMMARY = "Documentation for texlive-graphics-pln"
DESCRIPTION = "This package includes the documentation for texlive-graphics-pln"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71575"

RPM_NAME = "texlive-graphics-pln-doc-2026.226.svn71575-60.4.noarch.rpm"
RPM_HASH = "a860ba101e2a1060a04f5ab65e40315040b34b5091c23b7494423b649c0946d13f1b9a071ccd6e556769f886ddab1431de6f4f30f12f4f6ef8a746b68d0d4450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-pln-doc"

RDEPENDS:${PN} += ""

inherit rpm
