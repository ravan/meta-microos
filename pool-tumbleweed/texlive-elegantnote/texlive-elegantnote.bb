SUMMARY = "Elegant LaTeX Template for Notes"
DESCRIPTION = "ElegantNote is designed for writing working papers, especially \
for economics students. This template is based on the standard \
LaTeX article class. The goal of this template is to make the \
writing process easier and more comfortable."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.60svn78191"

RPM_NAME = "texlive-elegantnote-2026.226.2.60svn78191-61.4.noarch.rpm"
RPM_HASH = "a8416031ae507fe4c7e21fafa971d6d153386a163d39b0e4b504fad001b74aa08722391d7b0d69f3d911145764c76e3988e2ee041b9ddd4991a07e97d7430cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elegantnote.cls \
texlive-elegantnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-appendix.sty \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-ctex.sty \
tex-enumitem.sty \
tex-esint.sty \
tex-etoolbox.sty \
tex-extsizes.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-indentfirst.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-lstautogobble.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-silence.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
