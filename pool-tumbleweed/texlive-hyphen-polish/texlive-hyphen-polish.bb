SUMMARY = "Polish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Polish in QX and UTF-8 encodings. \
These patterns are also used by Polish TeX formats MeX and \
LaMeX."
LICENSE = "SUSE-TeX"

PV = "2026.226.3.0bsvn78069"

RPM_NAME = "texlive-hyphen-polish-2026.226.3.0bsvn78069-60.2.noarch.rpm"
RPM_HASH = "bd02f33ca20a707974158efadb38458b02e3d927928e03320b0a3ce919026b3b1883d4a2cafa63af69122f671da3ad541fb9d0608efd7dcd0362a197b02e92e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pl.qx.tex \
tex-hyph-pl.tex \
tex-loadhyph-pl.tex \
texlive-hyphen-polish"

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
