SUMMARY = "Documentation for texlive-pst-node"
DESCRIPTION = "This package includes the documentation for texlive-pst-node"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.45svn77682"

RPM_NAME = "texlive-pst-node-doc-2026.226.1.45svn77682-59.2.noarch.rpm"
RPM_HASH = "773e454465f624ede7d73aea468362f43b6d25801a884a636fb8354b6ee21cf1a75ff789bb925ea3e995f31fd7d7d31dc601153c8490936a2b6759985f82c6f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-node-doc-de \
texlive-pst-node-doc"

RDEPENDS:${PN} += ""

inherit rpm
