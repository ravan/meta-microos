SUMMARY = "Typeset tutorial-like documentations"
DESCRIPTION = "This package provides some macros to write documentation of \
LaTeX packages in a tutorial style."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.7.1svn76924"

RPM_NAME = "texlive-tutodoc-2026.226.1.7.1svn76924-59.2.noarch.rpm"
RPM_HASH = "fcce5d4269698fcc4e2b1696e110b948936c40a9feb6629d646b5d85746e604265ae8ad57d41e3bee948a6ed9a257dfc9521cbd7cc77b7afe84ba898e5d6b9fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tutodoc-bw.css.cls \
tex-tutodoc-color.css.cls \
tex-tutodoc-dark.css.cls \
tex-tutodoc-draft.css.cls \
tex-tutodoc-en.loc.cls \
tex-tutodoc-es.loc.cls \
tex-tutodoc-fr.loc.cls \
tex-tutodoc.cls \
texlive-tutodoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-clrstrip.sty \
tex-csquotes.sty \
tex-fontawesome5.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-keytheorems.sty \
tex-marginnote.sty \
tex-scrartcl.cls \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
