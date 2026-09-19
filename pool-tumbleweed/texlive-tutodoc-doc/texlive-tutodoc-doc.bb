SUMMARY = "Documentation for texlive-tutodoc"
DESCRIPTION = "This package includes the documentation for texlive-tutodoc"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.7.1svn76924"

RPM_NAME = "texlive-tutodoc-doc-2026.226.1.7.1svn76924-59.2.noarch.rpm"
RPM_HASH = "7996ec40f0a33ba377f625dd8d6654bdd1f6c44caefe96a1cf946fb16450ed9731767bda209b6428501827613b36216afe0e2e1781dce4049f3dcc0dff9e64a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tutodoc-doc-en;fr \
texlive-tutodoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
