SUMMARY = "Documentation for texlive-extractbb"
DESCRIPTION = "This package includes the documentation for texlive-extractbb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn77855"

RPM_NAME = "texlive-extractbb-doc-2026.226.1.1.0svn77855-59.2.noarch.rpm"
RPM_HASH = "8250b83eafb256be298ca8d0c8715fc5f73b89b110188b2b3887c3f1ff60b268a93b1ac4ffbc6c76a062284601350490a59ed7c21c91404624a86267244163b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-extractbb.1 \
texlive-extractbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
