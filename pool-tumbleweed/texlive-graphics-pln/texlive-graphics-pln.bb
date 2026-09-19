SUMMARY = "LaTeX-style graphics for Plain TeX users"
DESCRIPTION = "The Plain TeX graphics package is mostly a thin shell around \
the LaTeX graphicx and color packages, with support of the \
LaTeX-isms in those packages provided by miniltx (which is the \
largest part of the bundle). The bundle also contains a file \
'picture.tex', which is a wrapper around the autopict.sty, and \
provides the LaTeX picture mode to Plain TeX users."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71575"

RPM_NAME = "texlive-graphics-pln-2026.226.svn71575-60.4.noarch.rpm"
RPM_HASH = "f83add53fc3f3b48977a41e74a995197bbd9483a2e4e2a000f0c05b5cf17b1484bb672e71e330b29442dbe1454cf9cc7fdc63941d3c798bccbeec130e1b38845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopict.sty \
tex-color.tex \
tex-graphicx.tex \
tex-miniltx.tex \
tex-picture.tex \
tex-psfrag.tex \
texlive-graphics-pln"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
