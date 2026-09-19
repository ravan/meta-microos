SUMMARY = "Commands for CAS-like windows (Xcas or Geogebra) in TikZ"
DESCRIPTION = "This package provides some commands (in French) to display, \
with TikZ, windows like Xcas or Geogebra : \
\\begin{CalculFormelGeogebra} and \\LigneCalculsGeogebra ; \
\\begin{CalculFormelXcas} and \\LigneCalculsXcas."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn73069"

RPM_NAME = "texlive-fenetrecas-2026.226.0.0.1.4svn73069-59.2.noarch.rpm"
RPM_HASH = "890a817eca032c363c4fb8b1bf10713276a43395dcadd7bdc7f9d4a3a1be03e35207627e26b67e10d3075f38b447ebf1e518c1b56d5fe8d528efb64d44299075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FenetreCas.sty \
texlive-fenetrecas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-settobox.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
