SUMMARY = "Documentation for texlive-jura"
DESCRIPTION = "This package includes the documentation for texlive-jura"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.3svn15878"

RPM_NAME = "texlive-jura-doc-2026.226.4.3svn15878-63.2.noarch.rpm"
RPM_HASH = "ae68edc8c0b21a0cd131ae996b383d65820a10cbaa37dd8860fa9546b8905b4cd29a6d49aae12e0af3b4c4d5c7f3bfeac89f15bc08efbb1e071426f9c959d2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jura-doc-en;de \
texlive-jura-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
