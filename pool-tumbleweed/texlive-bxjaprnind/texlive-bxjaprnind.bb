SUMMARY = "Adjust the position of parentheses at paragraph head"
DESCRIPTION = "In Japanese typesetting, opening parentheses placed at the \
beginning of paragraphs or lines are treated specially; for \
example, while the paragraph indent before normal kanji \
characters is 1em, the indent before parentheses can be 0.5em, \
1em or 1.5em deoending on the local rule in effect."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn59641"

RPM_NAME = "texlive-bxjaprnind-2026.226.0.0.4asvn59641-59.2.noarch.rpm"
RPM_HASH = "d3b96265ef1f0e0ad52c54ca5f5007dd01cfc84154f878b467aa508a926b8fb0c90fbd3688025664aa54c19267abe67ae8c50584e8e85d1682335cb6edff6e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjaprnind.sty \
texlive-bxjaprnind"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bxtoolbox.sty \
tex-everyhook.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
