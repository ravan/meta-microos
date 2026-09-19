SUMMARY = "Typeset the syntax of commands and environments within coloured boxes"
DESCRIPTION = "When creating new packages or user guides, it is necessary to \
describe their syntax. This package helps by creating coloured \
frames with rounded corners, with a coloured background \
containing the coloured syntax text."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.8svn76790"

RPM_NAME = "texlive-framedsyntax-2026.226.0.0.2.8svn76790-60.2.noarch.rpm"
RPM_HASH = "a984772a51e1cd7ddf0a89c8a60f14895189ad11fd609e6098734ee1c9e6e4a235c8fe7d99251c87dab608b826605ecba3665522fba07b66682e1656f272f865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FramedSyntax.sty \
texlive-framedsyntax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pict2e.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
