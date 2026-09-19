SUMMARY = "Irish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Irish (Gaeilge) in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-irish-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "c890657d99c084355b7b3c8b1deaa13bd10de1441a3ddfb51f81e01bd2a11517373281489cf28ca2d93cb74baccf8dfb441889ab45ab4e3006f7e526c4840e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ga.ec.tex \
tex-hyph-ga.tex \
tex-loadhyph-ga.tex \
texlive-hyphen-irish"

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
