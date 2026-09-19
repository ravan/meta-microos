SUMMARY = "Creates miniature documents inside other LaTeX documents"
DESCRIPTION = "This package can be used to create miniature documents inside \
other LaTeX documents. Inside the minidocument all features of \
the outer vertical mode like page breaking, floats, marginpars, \
etc. are available."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn43752"

RPM_NAME = "texlive-minidocument-2026.226.1.0svn43752-61.2.noarch.rpm"
RPM_HASH = "84272e958a358025e85b702d7cbd43c74aa31ec92238491750d16147e98371848c0a40f3e2f069d0c43fd7eb972d867e65c78fecb3a10c3ce4c1a1824ee59a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minidocument.sty \
texlive-minidocument"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
