SUMMARY = "Georgian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Georgian in T8M, T8K and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-georgian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "7bf9c5f7dc2f28ad75a99bb0d3b9f27b1c72f0df855e4a2886735866c021ee40083d3d9c36c82f861f4e409520bcddfef4131dcbd6c47f80b7c68ac3b44a5d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ka.t8m.tex \
tex-hyph-ka.tex \
tex-loadhyph-ka.tex \
texlive-hyphen-georgian"

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
