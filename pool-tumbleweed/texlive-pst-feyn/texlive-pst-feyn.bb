SUMMARY = "Draw graphical elements for Feynman diagrams"
DESCRIPTION = "pst-feyn is a set of drawing graphical elements which are used \
for Feynman diagrams. The package is based on the macros of the \
old package axodraw but uses the capabilities of PSTricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn48781"

RPM_NAME = "texlive-pst-feyn-2026.226.0.0.01svn48781-59.2.noarch.rpm"
RPM_HASH = "7d82a8ab6b79bd7762bcbff4a5915c8d4fd2046aa732f2a463a0ec8ccce926f53c4c9b3c40cae53329dfa052eb95dffedd8a72f3ffdd4f17bdc3256994fa85f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-feyn.sty \
tex-pst-feyn.tex \
texlive-pst-feyn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
