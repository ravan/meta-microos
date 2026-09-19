SUMMARY = "Documentation for texlive-contracard"
DESCRIPTION = "This package includes the documentation for texlive-contracard"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn67201"

RPM_NAME = "texlive-contracard-doc-2026.226.2.0.0svn67201-61.2.noarch.rpm"
RPM_HASH = "9b54c5a944e6f9007480af4ace5b20d267c52c5d244785d3b65649c486847e127621a010913e598e88bddfa40c748addbef9a03bb159ba3008987bfc8ac1c33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-contracard-doc"

RDEPENDS:${PN} += ""

inherit rpm
