SUMMARY = "Documentation for texlive-twoxtwogame"
DESCRIPTION = "This package includes the documentation for texlive-twoxtwogame"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.2svn70423"

RPM_NAME = "texlive-twoxtwogame-doc-2026.226.0.0.2svn70423-59.2.noarch.rpm"
RPM_HASH = "0dd680a1931cfffcff19210ea02fa79a5e17065bec130f62675b1f848ab73015ea4e7b6302bb4cca09629756e9420c75a5c46b4ec64471a8fe6f2065eb63f5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twoxtwogame-doc"

RDEPENDS:${PN} += ""

inherit rpm
