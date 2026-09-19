SUMMARY = "Documentation for texlive-typewriter"
DESCRIPTION = "This package includes the documentation for texlive-typewriter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn73877"

RPM_NAME = "texlive-typewriter-doc-2026.226.1.3svn73877-59.2.noarch.rpm"
RPM_HASH = "3c250477dfbb1ba65d88be8a38ec45797f3e20daa17157b9f70f645c84e0f05033d2815384b83b1a6b04069811cfb54a6de508695ac2125883898e30c54bd7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typewriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
