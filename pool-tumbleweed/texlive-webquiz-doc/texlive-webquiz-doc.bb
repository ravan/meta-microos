SUMMARY = "Documentation for texlive-webquiz"
DESCRIPTION = "This package includes the documentation for texlive-webquiz"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.5.2svn58808"

RPM_NAME = "texlive-webquiz-doc-2026.226.5.2svn58808-60.2.noarch.rpm"
RPM_HASH = "edf2e6f2cfd530f3015b1e83173f83bcba73f50abe563f3dc45dbc66fd4f2f916343e86be71c0cac7753d4fba02d387a44d7fa7e9dc60ebf3ad7bdc5b0a7811a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-webquiz.1 \
texlive-webquiz-doc"

RDEPENDS:${PN} += ""

inherit rpm
