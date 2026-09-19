SUMMARY = "Documentation for texlive-unfonts-extra"
DESCRIPTION = "This package includes the documentation for texlive-unfonts-extra"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn56291"

RPM_NAME = "texlive-unfonts-extra-doc-2026.226.svn56291-60.2.noarch.rpm"
RPM_HASH = "7ed15abfdc7f0e9f5baa4b5613a55f7bdc751758953ae392209f28147e6054cf7bc6d73716490d05d66bb693960c75f4cf204fa075e16a2de0c5ff5fde43c95a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
