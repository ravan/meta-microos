SUMMARY = "Documentation for texlive-luciole"
DESCRIPTION = "This package includes the documentation for texlive-luciole"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.60svn77682"

RPM_NAME = "texlive-luciole-doc-2026.226.0.0.60svn77682-59.2.noarch.rpm"
RPM_HASH = "a79c7b4860d2b77b742669fe8d9f273b70389d0fbee2036d18f3e6b7bfd798dd1ac302e0de2c8b101ddc661807cd4dc98db1b41ae5528b783f02c8e27de218e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luciole-doc"

RDEPENDS:${PN} += ""

inherit rpm
