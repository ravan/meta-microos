SUMMARY = "Documentation for texlive-sugconf"
DESCRIPTION = "This package includes the documentation for texlive-sugconf"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn58752"

RPM_NAME = "texlive-sugconf-doc-2026.226.svn58752-64.2.noarch.rpm"
RPM_HASH = "9b5337f66183efeba8129fc20174525c0d7bcf0f45eca1ec6f980426e6d0a1ab15b3969b37213385f8dd834b3bde685984226f14b6a90893f6e1141b98e24210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sugconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
