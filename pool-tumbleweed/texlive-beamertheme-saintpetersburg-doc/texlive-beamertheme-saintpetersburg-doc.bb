SUMMARY = "Documentation for texlive-beamertheme-saintpetersburg"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-saintpetersburg"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45877"

RPM_NAME = "texlive-beamertheme-saintpetersburg-doc-2026.226.svn45877-61.2.noarch.rpm"
RPM_HASH = "6f16ed76feb2b30fd5275552d740e9254e92dc5814e666af6bd0cf9f286173cd57d0e217d2579dbe640c9a848f3c7a7cb6d68364874f0c5f2e821c7145fcb587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-saintpetersburg-doc"

RDEPENDS:${PN} += ""

inherit rpm
