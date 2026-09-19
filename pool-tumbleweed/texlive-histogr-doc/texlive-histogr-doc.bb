SUMMARY = "Documentation for texlive-histogr"
DESCRIPTION = "This package includes the documentation for texlive-histogr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-histogr-doc-2026.226.1.01svn15878-60.4.noarch.rpm"
RPM_HASH = "10b5e6eb355c69b972abfddf7842f167d65ddacc5451b09115b99f6beebd33ebf708c375257591131e8fa322922b83b2a83db71880e7bfa3df8f51e792c8fc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-histogr-doc"

RDEPENDS:${PN} += ""

inherit rpm
