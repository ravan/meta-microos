SUMMARY = "Documentation for texlive-extract"
DESCRIPTION = "This package includes the documentation for texlive-extract"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9asvn52117"

RPM_NAME = "texlive-extract-doc-2026.226.1.9asvn52117-59.2.noarch.rpm"
RPM_HASH = "177f788a8867002b51c17454896f202d4fb2a5af11b3ebba21149e8503d6de6a32ea45b621f194ceb63089ab831947cb6285b8d419984d598d402c3c14098a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extract-doc"

RDEPENDS:${PN} += ""

inherit rpm
