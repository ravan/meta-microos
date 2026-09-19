SUMMARY = "Documentation for texlive-expex-acro"
DESCRIPTION = "This package includes the documentation for texlive-expex-acro"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3svn68046"

RPM_NAME = "texlive-expex-acro-doc-2026.226.0.0.0.3svn68046-59.2.noarch.rpm"
RPM_HASH = "442b402f7cf8f00ca44a2b2b6b167807d389f00b285296bcadfdba9f09dfbef77f36922f86057671c675cb4ab63004c595ff205604297433a4263c6b5ee80437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-acro-doc"

RDEPENDS:${PN} += ""

inherit rpm
