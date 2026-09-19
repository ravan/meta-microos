SUMMARY = "Documentation for texlive-statistik"
DESCRIPTION = "This package includes the documentation for texlive-statistik"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.03svn20334"

RPM_NAME = "texlive-statistik-doc-2026.226.0.0.03svn20334-64.2.noarch.rpm"
RPM_HASH = "39146c765c3321040f63c271762872930e1d83bb7df28be39ef0c8eedefe9f6eaf26dbd8eec5d9f0b97f4b792677496e13a43b6bf9d9c67fbbdf2c1750263d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statistik-doc"

RDEPENDS:${PN} += ""

inherit rpm
