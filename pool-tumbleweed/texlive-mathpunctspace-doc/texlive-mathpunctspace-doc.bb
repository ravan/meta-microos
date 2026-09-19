SUMMARY = "Documentation for texlive-mathpunctspace"
DESCRIPTION = "This package includes the documentation for texlive-mathpunctspace"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn46754"

RPM_NAME = "texlive-mathpunctspace-doc-2026.226.1.1svn46754-59.2.noarch.rpm"
RPM_HASH = "d137220f990552b119a1a0c209d27f804942dcd01663a7b0833f9499c7de85ed4eb5f3834789b8a9e223457bf20c54ebc1b82bd0e22500ccdcb48b51c94d5b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpunctspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
