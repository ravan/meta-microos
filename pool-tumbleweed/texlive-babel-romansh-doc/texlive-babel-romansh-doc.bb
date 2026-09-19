SUMMARY = "Documentation for texlive-babel-romansh"
DESCRIPTION = "This package includes the documentation for texlive-babel-romansh"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-babel-romansh-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "9099610ca70bbe67f02ca0c9ecfb1a34483483104bd45b5831f4233d3e70898d82daca7274a17ee3af5537d3ee73bc9084b9ce827338ca36b2849ecf901fc272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-romansh-doc"

RDEPENDS:${PN} += ""

inherit rpm
