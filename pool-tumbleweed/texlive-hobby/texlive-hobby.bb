SUMMARY = "An implementation of Hobby's algorithm for PGF/TikZ"
DESCRIPTION = "This package defines a path generation function for PGF/TikZ \
which implements Hobby's algorithm for a path built out of \
Bezier curves which passes through a given set of points. The \
path thus generated may by used as a TikZ 'to path'. The \
implementation is in LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn76924"

RPM_NAME = "texlive-hobby-2026.226.1.12svn76924-60.4.noarch.rpm"
RPM_HASH = "c591f821919eef412e0e89047bdcf1b3dba6c6d8a46506b12358ba3ebfe2f447e250ac43d44dd86c9a199497c766a7330c8c40e67267e80d7f4f06ccef0abf72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hobby-l3draw.sty \
tex-hobby.code.tex \
tex-pgflibraryhobby.code.tex \
tex-pml3array.sty \
tex-tikzlibraryhobby.code.tex \
texlive-hobby"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
