SUMMARY = "Documentation for texlive-to-be-determined"
DESCRIPTION = "This package includes the documentation for texlive-to-be-determined"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.2svn72527"

RPM_NAME = "texlive-to-be-determined-doc-2026.226.0.0.3.2svn72527-59.2.noarch.rpm"
RPM_HASH = "437ec6ac71ab76d14366d8f5cd4244d7f80c7f786d828adb97f51709b15e5aa3876d9dfda70510033e44d7ebcb6fb3797bbc639b08ea6834e198dcba0ae3096a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-to-be-determined-doc"

RDEPENDS:${PN} += ""

inherit rpm
