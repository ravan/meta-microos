SUMMARY = "Documentation for texlive-contour"
DESCRIPTION = "This package includes the documentation for texlive-contour"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn77682"

RPM_NAME = "texlive-contour-doc-2026.226.2.14svn77682-61.2.noarch.rpm"
RPM_HASH = "58b80acf94a293986864e35741b0f08b0a204334e3608a87e361a12722754f80bb013138800aca496c79f60c04e8d9381e24bb0b5fb7f9031798a7363e3ea790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-contour-doc"

RDEPENDS:${PN} += ""

inherit rpm
