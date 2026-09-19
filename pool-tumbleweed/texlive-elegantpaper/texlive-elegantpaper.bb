SUMMARY = "An Elegant LaTeX Template for Working Papers"
DESCRIPTION = "ElegantPaper is designed for writing working papers, especially \
for economics students. This template is based on the standard \
LaTeX article class. The goal of this template is to make the \
writing process easier and more comfortable."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn78191"

RPM_NAME = "texlive-elegantpaper-2026.226.0.0.12svn78191-61.4.noarch.rpm"
RPM_HASH = "7fc4ba93c7dba9effa4958345bdd0c7c7b2a3092c14dd96fc31900308850fdd3243305d9c535976e896969b0800928a153b9036a5653ce2475a0f36951b37c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elegantpaper.cls \
texlive-elegantpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-appendix.sty \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-ctex.sty \
tex-enumitem.sty \
tex-esint.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-indentfirst.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
