SUMMARY = "Indonesian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Indonesian (Bahasa Indonesia) in ASCII \
encoding. They are probably also usable for Malay (Bahasa \
Melayu)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-indonesian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "ff6200a92a87ad94d50f68b3f089aaf7c95dc090733dd9b5f1e19daf5b6f405b6405c60e18df65a578112c06b8c385f92cc86c14c2f73217959e51b5373ec4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-id.tex \
tex-loadhyph-id.tex \
texlive-hyphen-indonesian"

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
