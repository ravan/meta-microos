SUMMARY = "Documentation for texlive-babel-basque"
DESCRIPTION = "This package includes the documentation for texlive-babel-basque"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0fsvn77682"

RPM_NAME = "texlive-babel-basque-doc-2026.226.1.0fsvn77682-60.2.noarch.rpm"
RPM_HASH = "ec7c0c4e7e1ff589378e34e643c2f3fa2e2602680568c9584e854dea78585568f29df0ed137974c65ce000a64a30b5c2a8136111d47182faa08ef9d36ded3d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-basque-doc"

RDEPENDS:${PN} += ""

inherit rpm
