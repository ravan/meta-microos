SUMMARY = "Swedish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Swedish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-swedish-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "e75dd9da1351402a67784af08bc1ab2ca392f44c271f2f95e308fa6e69bad941fa0bb635763b654f0d18ee52b9849b179f7f5f51b019cc3b335466d9a3b4c2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sv.ec.tex \
tex-hyph-sv.tex \
tex-loadhyph-sv.tex \
texlive-hyphen-swedish"

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
