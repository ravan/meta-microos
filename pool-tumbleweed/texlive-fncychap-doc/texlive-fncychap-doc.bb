SUMMARY = "Documentation for texlive-fncychap"
DESCRIPTION = "This package includes the documentation for texlive-fncychap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn77682"

RPM_NAME = "texlive-fncychap-doc-2026.226.1.34svn77682-60.2.noarch.rpm"
RPM_HASH = "031350c4d59288efc6728e91f1be6c48f1ccfc8887c1fda0ffa1aa8a6f8f09199b54338992aac7282c85b2411ccd799acd75bb4fe02a64019b2b1817b2caa6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fncychap-doc"

RDEPENDS:${PN} += ""

inherit rpm
