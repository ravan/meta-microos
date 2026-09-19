SUMMARY = "Documentation for texlive-mwe"
DESCRIPTION = "This package includes the documentation for texlive-mwe"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-mwe-doc-2026.226.0.0.5svn77682-61.2.noarch.rpm"
RPM_HASH = "23fddbca78c05e48cf2f0d641283bd5e5fa5ccdf794b89b89c513b5afa0711c027ca472a43aa8d411451c8c4cb43fe50f88e4eb3722f47115b75b992eb4b8fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mwe-doc"

RDEPENDS:${PN} += ""

inherit rpm
