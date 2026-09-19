SUMMARY = "A class for theses at University of Brasilia (UnB)"
DESCRIPTION = "This package provides a class based on abnTeX and compatible \
with pdflatex and BibTeXr to prepare bachelor, master, and \
doctoral theses for the University of Brasilia (UnB), Brazil. \
The class also comes with a template for the various types of \
theses for undergraduate and graduate programs at UnB. The \
documentation for the class and the comments in the templates \
are all written in Portuguese, the language of the target \
audience."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.7svn76237"

RPM_NAME = "texlive-unbtex-2026.226.1.5.7svn76237-60.2.noarch.rpm"
RPM_HASH = "51515d95513e3408e49da72deb590a53afac329c2526ee6ac3a246419c57d2dd34f398152a0338684eb41090004d2bafca11409ece81d0c50f7f2b43e70dc8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unbtex.cls \
texlive-unbtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntex2.cls \
tex-abntex2cite.sty \
tex-algorithm2e.sty \
tex-amsthm.sty \
tex-backref.sty \
tex-bm.sty \
tex-cite.sty \
tex-cleveref.sty \
tex-colortbl.sty \
tex-fvextra.sty \
tex-icomma.sty \
tex-inconsolata.sty \
tex-indentfirst.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-mdframed.sty \
tex-mem11.clo \
tex-microtype.sty \
tex-multirow.sty \
tex-newtxmath.sty \
tex-nomencl.sty \
tex-pdfpages.sty \
tex-scontents.sty \
tex-stickstootext.sty \
tex-subfig.sty \
tex-tgheros.sty \
tex-tocbasic.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
