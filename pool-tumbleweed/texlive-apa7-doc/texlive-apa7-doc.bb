SUMMARY = "Documentation for texlive-apa7"
DESCRIPTION = "This package includes the documentation for texlive-apa7"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn63974"

RPM_NAME = "texlive-apa7-doc-2026.226.2.16svn63974-61.2.noarch.rpm"
RPM_HASH = "bd51d1213f05be1ea79e9173b2278efb563dcd2dccd7e9c93430f047b786166c373b82d76074839c63b8fff3a3f1e4dfc1f9dcb52f6f2b049ca9f5c6c9903819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa7-doc"

RDEPENDS:${PN} += ""

inherit rpm
