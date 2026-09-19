SUMMARY = "Documentation for texlive-tikz2d-fr"
DESCRIPTION = "This package includes the documentation for texlive-tikz2d-fr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-tikz2d-fr-doc-2026.226.0.0.1.1svn73069-59.2.noarch.rpm"
RPM_HASH = "e2596d0c062c23a04f9c9949753c4a29bdcf7ea0ec9b73e147cdfa3badb8eaf2298b983b70e1c8424afde1772a38879672b6d9b062aadb39fdcbf9e0af9acb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz2d-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
