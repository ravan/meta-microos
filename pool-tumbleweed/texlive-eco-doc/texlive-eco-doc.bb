SUMMARY = "Documentation for texlive-eco"
DESCRIPTION = "This package includes the documentation for texlive-eco"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn29349"

RPM_NAME = "texlive-eco-doc-2026.226.1.3svn29349-61.4.noarch.rpm"
RPM_HASH = "23b03f46de5eeb8a119828b73a4e18c984209f67c7ca96089d2e73c4251f059f4ff8568654324597ff9656cf57c58424e4bde2ecebb82d5c8da9a732fee384c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eco-doc"

RDEPENDS:${PN} += ""

inherit rpm
