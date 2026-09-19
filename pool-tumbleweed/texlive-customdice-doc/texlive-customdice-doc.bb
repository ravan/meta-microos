SUMMARY = "Documentation for texlive-customdice"
DESCRIPTION = "This package includes the documentation for texlive-customdice"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64089"

RPM_NAME = "texlive-customdice-doc-2026.226.1.1svn64089-61.2.noarch.rpm"
RPM_HASH = "7e15d7e08863c1a9fcf79054fc9ccbab071e156728c4e6c6e480fa95d25eb20966093e233fa4feff5eab52463d2deed9e6fbd9f3030fe2e95a08b3a30afa58dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-customdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
