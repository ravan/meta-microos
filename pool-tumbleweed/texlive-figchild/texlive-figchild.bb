SUMMARY = "Pictures for creating children's activities"
DESCRIPTION = "This package was created with the aim of facilitating the work \
of Elementary School teachers who need to create colorful and \
attractive activities for their students. It is a product of \
the Computational Mathematics discipline offered at the Federal \
University of Vicosa -- Campus UFV -- Florestal by professor \
Fernando de Souza Bastos. At the time, professor Fernando was a \
faculty member at the UFV Florestal campus. Currently, he is a \
professor in the Department of Statistics at the UFV main \
campus in Vicosa. The package makes use of the TikZ and xcolor \
packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.1svn75801"

RPM_NAME = "texlive-figchild-2026.226.3.1.1svn75801-59.2.noarch.rpm"
RPM_HASH = "ef8397d4b86bedef444ea0b72ab5d96c334d6b6e717ec103f58bc2e117fbb9ab515b100ca468977be5ddbeaf29c2bf8eca4e15c8c5e7b824a4825455b6baad71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figchild.sty \
texlive-figchild"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
