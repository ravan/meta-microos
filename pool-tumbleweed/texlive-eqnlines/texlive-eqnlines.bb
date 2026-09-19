SUMMARY = "Single- and multiline equations"
DESCRIPTION = "This LaTeX2e package provides a framework for typesetting \
single- and multiline equations which extends the established \
equation environments of LaTeX and the amsmath package with \
many options for convenient adjustment of the intended layout. \
In particular, the package adds flexible schemes for numbering, \
horizontal alignment and semi-automatic punctuation, and it \
improves upon the horizontal and vertical spacing options. The \
extensions can be used and adjusted through optional arguments \
and modifiers to the equation environments as well as global \
settings."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77877"

RPM_NAME = "texlive-eqnlines-2026.226.1.0svn77877-61.4.noarch.rpm"
RPM_HASH = "5d76b712d8d9e733364f3cfb19633b5b48c03c0e75028f248c6a41ecf7695f34564fbfa945380eaad09d152895115464ffabc35fbf5bcb959bd6ed9d15f709e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnlines.sty \
texlive-eqnlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
