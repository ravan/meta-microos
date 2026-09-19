SUMMARY = "Vietnamese hyphenation patterns"
DESCRIPTION = "Prevents hyphenation in Vietnamese."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74032"

RPM_NAME = "texlive-hyphen-vietnamese-2026.226.svn74032-60.2.noarch.rpm"
RPM_HASH = "1f0f521debdc7b1faaaadf878c66a4066864047789a871ead6276025e57e0f71edc8c45d2e8ccb93576595f161342111675d8553ae865586029e3e39f9b4255e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-vi.tex \
texlive-hyphen-vietnamese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
