SUMMARY = "Document class for the Cahiers du GERAD series"
DESCRIPTION = "This package provides the geradwp class, a class based on \
article and compatible with LaTeX. With this class, researchers \
at GERAD will be able to write their working paper while \
complying to all the presentation standards required by the \
Cahiers du GERAD series."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn63134"

RPM_NAME = "texlive-geradwp-2026.226.1.1svn63134-60.2.noarch.rpm"
RPM_HASH = "4a4fa1a4cce290c5b5ce7d52f026679d52c0541852af14372a3e41de294ff871c4921c5eb6720bd0110252f043b5830a0bb6f4161ef4f8f59f91f31e1de1ea3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geradwp.cls \
texlive-geradwp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-latexsym.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
