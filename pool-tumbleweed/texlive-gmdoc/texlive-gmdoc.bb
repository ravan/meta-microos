SUMMARY = "Documentation of LaTeX packages"
DESCRIPTION = "A LaTeX package and an example class for documenting (La)TeX \
packages, document classes, .dtx etc., providing hyperlinks. \
The package is believed to be compatible with doc and permits \
minimal markup of code (the macrocode environment is no longer \
necessary). The package provides automatic detection of \
definitions (detecting such things as \\def, \\newcommand, \
\\DeclareOption etc.). The package needs hyperref and the \
author's three 'basic' packages: gmutils, gmverb and gmiflink. \
As a bonus (and as an example of doc compatibility) driver \
files are provided that may be used to typeset the LaTeX Base."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-2026.226.0.0.993svn21292-60.4.noarch.rpm"
RPM_HASH = "f15882c9ff18962464ff68de83c89e0107fa7117d5fb8bd02eef0cd7f2920bed966e18d52e77608627dca161d3d7e1fa215cc6a76b380f55da1fe09fb2fa06ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmdoc.sty \
tex-gmdocc.cls \
tex-gmoldcomm.sty \
texlive-gmdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-fontenc.sty \
tex-geometry.sty \
tex-gmiflink.sty \
tex-gmutils.sty \
tex-gmverb.sty \
tex-lmodern.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-tikz.sty \
tex-trace.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
