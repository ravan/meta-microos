SUMMARY = "Documentation for texlive-booktabs"
DESCRIPTION = "This package includes the documentation for texlive-booktabs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.61803398svn77682"

RPM_NAME = "texlive-booktabs-doc-2026.226.1.61803398svn77682-59.2.noarch.rpm"
RPM_HASH = "70e1bb1f18c8780dba1d0c395a63d31ffe2f13b9af5b401556deb8a0e52c8dc20d157f88b5832c7431a2791be8bdd1be79b8b6948f7b4652c0ffd03c737e375d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-booktabs-doc-en \
texlive-booktabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
