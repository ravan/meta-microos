SUMMARY = "Documentation for texlive-verifica"
DESCRIPTION = "This package includes the documentation for texlive-verifica"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn75682"

RPM_NAME = "texlive-verifica-doc-2026.226.2.0svn75682-60.2.noarch.rpm"
RPM_HASH = "de0ad86f84d851f4eebc488775d89c5eec203e66ef4f525d99e4ddd9912cb6b9450fbfbd403c6c84c134f6a2f9e2c682ff0562dade892e3a5d51ab27f463b78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-verifica-doc-it \
texlive-verifica-doc"

RDEPENDS:${PN} += ""

inherit rpm
