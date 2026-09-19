SUMMARY = "Documentation for texlive-contract"
DESCRIPTION = "This package includes the documentation for texlive-contract"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn69759"

RPM_NAME = "texlive-contract-doc-2026.226.0.0.91svn69759-61.2.noarch.rpm"
RPM_HASH = "03c41a24dbc31902512e0cef86e35a0e6c217123b25428a2150d1e244f82aa54b3b22575b0f47b53cc16ccbcabeee3eb83a93059d1970f06e7fb2d76195f293a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-contract-doc-de \
texlive-contract-doc"

RDEPENDS:${PN} += ""

inherit rpm
