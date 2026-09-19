SUMMARY = "Documentation for texlive-booklet"
DESCRIPTION = "This package includes the documentation for texlive-booklet"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7bsvn77682"

RPM_NAME = "texlive-booklet-doc-2026.226.0.0.7bsvn77682-59.2.noarch.rpm"
RPM_HASH = "fbc597eb559f8669ff990f8e5bb512e2a0cb66eae801ecd265778392fcb12b8d4ad2f6de0a5efdcc81b72d1ae4f6ac2fa0b8955cc70cea56262c837f7e05ac3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booklet-doc"

RDEPENDS:${PN} += ""

inherit rpm
