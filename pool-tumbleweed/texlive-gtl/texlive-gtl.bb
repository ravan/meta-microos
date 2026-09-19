SUMMARY = "Manipulating generalized token lists"
DESCRIPTION = "The package provides tools for simple operations on lists of \
tokens which are not necessarily balanced. It is in particular \
used a lot in the unravel package, to go through tokens one at \
a time rather than having to work with entire braced groups at \
a time."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn69297"

RPM_NAME = "texlive-gtl-2026.226.0.0.6svn69297-60.4.noarch.rpm"
RPM_HASH = "56669cad0b67e6bb9bfc867bf93f193cb819e21e2048632b63f23acea1db92ac7b5a621528fe9b83aaf71553876b0ce0e1dbaa5d2f85acbe39dd5dd1f22773d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtl.sty \
texlive-gtl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3-generic.tex \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
