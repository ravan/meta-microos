SUMMARY = "Template for a simple thesis or dissertation (Ph.D. or master's degree) or technical report, in XeLaTeX"
DESCRIPTION = "Template for a simple thesis or dissertation (Ph.D. or master's \
degree) or technical report, in XeLaTeX. Simple template that \
can be further customized or extended, with numerous examples. \
Consistent style for figures, tables, mathematical theorems, \
definitions, lemmas, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn43058"

RPM_NAME = "texlive-simple-thesis-dissertation-2026.226.svn43058-60.2.noarch.rpm"
RPM_HASH = "95627fc88752f40ee3e180a48d27c937fe4cdf0b6e3862b3c4bd1785706c442c8516f745b692dae85b19727e4ce06250ea36fbdac96d7df2773b6941c3a45dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplethesisdissertation.cls \
texlive-simple-thesis-dissertation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algpseudocode.sty \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-arydshln.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-cite.sty \
tex-color.sty \
tex-datetime2.sty \
tex-environ.sty \
tex-fontspec.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lipsum.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-report.cls \
tex-rotating.sty \
tex-setspace.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-underscore.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
