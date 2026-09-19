SUMMARY = "Documentation for texlive-mathfont"
DESCRIPTION = "This package includes the documentation for texlive-mathfont"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0asvn77682"

RPM_NAME = "texlive-mathfont-doc-2026.226.3.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "6f6eb158ed2c0fdeb2b90d4b18b3f474ddbec2fdc7fc2d3090ca1d267109913d5527e898698d5ab498620f3f8639e2d7197431550d3e251e5b8b2a74c7862447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
