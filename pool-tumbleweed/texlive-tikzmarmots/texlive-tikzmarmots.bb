SUMMARY = "Drawing little marmots in TikZ"
DESCRIPTION = "This is a LaTeX package for marmots to be used in TikZ \
pictures. These little figures are constructed in such a way \
that they may even 'borrow' some accessories and other \
attributes from the TikZlings package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn76924"

RPM_NAME = "texlive-tikzmarmots-2026.226.2.2svn76924-59.2.noarch.rpm"
RPM_HASH = "c8ee752e237fff5fd08a63ee4b35a1a81490e7495d2465e1499b8ab192a429c92c57f173f6a6318d19158ae934751b0beed7113d2397b069c6541955c4479a4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarymarmots.code.tex \
tex-tikzmarmots-v1.sty \
tex-tikzmarmots.sty \
texlive-tikzmarmots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-tikz.sty \
tex-tikzlings-marmots.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tikzlings"

inherit rpm
