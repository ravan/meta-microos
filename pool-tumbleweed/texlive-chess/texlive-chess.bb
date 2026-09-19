SUMMARY = "Fonts for typesetting chess boards"
DESCRIPTION = "The original (and now somewhat dated) TeX chess font package. \
Potential users should consider skak (for alternative fonts, \
and notation support), texmate (for alternative notation \
support), or chessfss (for flexible font choices)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-chess-2026.226.1.2svn78101-60.2.noarch.rpm"
RPM_HASH = "f1e8a393cdbac34e630747995fdce0ba8eaae6c16fedfa56da4a2a9d38ce4665139b212089be1d7531295d3f56837ea9779d1e815f281e0e9a32d0b4b0ffa0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chess.sty \
tex-chess10.tfm \
tex-chess20.tfm \
tex-chess30.tfm \
tex-chessf10.tfm \
tex-chessfig10.tfm \
texlive-chess"

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
