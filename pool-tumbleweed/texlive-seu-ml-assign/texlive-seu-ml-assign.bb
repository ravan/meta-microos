SUMMARY = "Southeast University Machine Learning Assignment template"
DESCRIPTION = "This is a template for the Southeast University Machine \
Learning Assignment that can be easily adapted to other usages. \
This template features a colorful theme that makes it look \
elegant and attractive. You can also find the template \
available on Overleaf."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn62933"

RPM_NAME = "texlive-seu-ml-assign-2026.226.1.1svn62933-60.2.noarch.rpm"
RPM_HASH = "2b317a8abc8aeb3134a0e46fb7e50cdd51b5f15ee44bc9e79ba66cf0014c22e1eba5e267ec28a2934a2a9322998c978beb61d2ac585bcf80ef8bdf04ebaa0688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seu-ml-assign.cls \
texlive-seu-ml-assign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-bm.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-mathtools.sty \
tex-nicematrix.sty \
tex-suffix.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
