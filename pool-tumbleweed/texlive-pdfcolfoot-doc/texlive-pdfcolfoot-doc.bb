SUMMARY = "Documentation for texlive-pdfcolfoot"
DESCRIPTION = "This package includes the documentation for texlive-pdfcolfoot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-pdfcolfoot-doc-2026.226.1.4svn77682-58.2.noarch.rpm"
RPM_HASH = "7824d75bc703a581341007c7dc4168644e295f3e86926ef3d1db3744c08c6d1243d83025383e6b4655056e224024078d542f70293ec7cc1acb8865665e4cf33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcolfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
