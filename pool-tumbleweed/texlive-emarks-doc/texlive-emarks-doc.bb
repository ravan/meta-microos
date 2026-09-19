SUMMARY = "Documentation for texlive-emarks"
DESCRIPTION = "This package includes the documentation for texlive-emarks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24504"

RPM_NAME = "texlive-emarks-doc-2026.226.1.0svn24504-61.4.noarch.rpm"
RPM_HASH = "b9c9692ec78369cfb5fd377d65c1b4343f6a04eb692df94bc8bf68c25466b0791190b3b01d6b2a8f7d74b8790141046e1dee8f03ee66f29c870803f586759e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emarks-doc"

RDEPENDS:${PN} += ""

inherit rpm
