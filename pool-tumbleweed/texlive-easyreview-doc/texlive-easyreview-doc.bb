SUMMARY = "Documentation for texlive-easyreview"
DESCRIPTION = "This package includes the documentation for texlive-easyreview"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn38352"

RPM_NAME = "texlive-easyreview-doc-2026.226.1.0svn38352-61.4.noarch.rpm"
RPM_HASH = "175b34ec45ed04e7803c26a7d7da3be08c000a8f2f104d554b38ee5d8aa515c455180793991e53cc123abf71ef887ff6bd8fa7f40488df749d0d6d4951913935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyreview-doc"

RDEPENDS:${PN} += ""

inherit rpm
