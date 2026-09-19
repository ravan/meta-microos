SUMMARY = "Documentation for texlive-biblatex-jura2"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-jura2"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn64762"

RPM_NAME = "texlive-biblatex-jura2-doc-2026.226.0.0.5svn64762-61.2.noarch.rpm"
RPM_HASH = "cf51d117b39563309e1070278cea16d23613feac8368a6fd1dac150dc6d50e08270693bc6bcac02d20d20c4cf1af3b20b56244b2285da6935396817b5c10b6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-jura2-doc-de \
texlive-biblatex-jura2-doc"

RDEPENDS:${PN} += ""

inherit rpm
