SUMMARY = "Documentation for texlive-handout"
DESCRIPTION = "This package includes the documentation for texlive-handout"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.0svn43962"

RPM_NAME = "texlive-handout-doc-2026.226.1.6.0svn43962-60.4.noarch.rpm"
RPM_HASH = "b7fd4c06db105c994fe258c01c829e3e354c1ac819d740cc55e508c1ea88aa3d6f3ce2a152094bed3a5ccc21267af0dcec2e7dce10a6888a4c9731b5f59a98b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handout-doc"

RDEPENDS:${PN} += ""

inherit rpm
