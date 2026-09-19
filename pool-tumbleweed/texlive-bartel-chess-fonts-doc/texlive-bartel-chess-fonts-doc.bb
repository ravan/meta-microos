SUMMARY = "Documentation for texlive-bartel-chess-fonts"
DESCRIPTION = "This package includes the documentation for texlive-bartel-chess-fonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-bartel-chess-fonts-doc-2026.226.svn78101-60.2.noarch.rpm"
RPM_HASH = "2b62d228306adff60efe7610eafc67029867ce8c34c43de25f8a314a6f24da8269764370e074915bc6c628e0822c510e88fe5dd73c7dd25ab4da5a5981b6e78c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bartel-chess-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
