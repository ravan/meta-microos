SUMMARY = "Documentation for texlive-cm-lgc"
DESCRIPTION = "This package includes the documentation for texlive-cm-lgc"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5svn28250"

RPM_NAME = "texlive-cm-lgc-doc-2026.226.0.0.5svn28250-60.2.noarch.rpm"
RPM_HASH = "55257b91a7b372f0f352cad63c6945e899befd0c605440d3f7b4fb37bfbf95175e7766d200c1071f46bfc7d2b23ed5f6e61db8558966b29bb05bc782f5ae9847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-lgc-doc"

RDEPENDS:${PN} += ""

inherit rpm
