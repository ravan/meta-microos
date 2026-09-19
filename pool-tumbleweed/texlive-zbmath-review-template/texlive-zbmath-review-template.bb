SUMMARY = "Template for a zbMATH Open review"
DESCRIPTION = "This package contains a template for zbMATH Open reviews. It \
will show what your review will look like on zbMATH Open and \
you can test whether your LaTeX-Code will compile on our \
system. The template has to be compiled using XeLaTeX and \
relies on scrartcl, scrlayer-scrpage, amsfonts, amssymb, \
amsmath, babel, enumitem, etoolbox, fontspec, gensymb, \
geometry, graphicx, mathrsfs, mathtools, stmaryrd, textcomp, \
tikz-cd, xcolor, and xparse."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-2026.226.2.1svn59693-59.4.noarch.rpm"
RPM_HASH = "0bf959eb5cc6bea8dc37c0b3e62bacf5ad61e652278a03cb6d4ae45121fd15de7b556db153de4f04a85eb7e47ccf088ae6f546d1ca6de0e06642e588352ed31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zb-basics.sty \
tex-zbMATH.cls \
texlive-zbmath-review-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-gensymb.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-stmaryrd.sty \
tex-textcomp.sty \
tex-tikz-cd.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
