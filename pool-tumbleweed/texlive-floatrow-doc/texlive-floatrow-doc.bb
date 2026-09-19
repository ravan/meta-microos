SUMMARY = "Documentation for texlive-floatrow"
DESCRIPTION = "This package includes the documentation for texlive-floatrow"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3bsvn77682"

RPM_NAME = "texlive-floatrow-doc-2026.226.0.0.3bsvn77682-60.2.noarch.rpm"
RPM_HASH = "3a3b2a51604c32d93af61c5990eb9a348ea2f9a95c282d9c6edfb8604bdbfc398bc5afc77dd917c23c2225fa9d7c84898d6d41501344d6f13c9c56783c6e6f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-floatrow-doc-ru;en \
texlive-floatrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
