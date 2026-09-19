SUMMARY = "Modern Greek hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Modern Greek in monotonic and \
polytonic spelling in LGR and UTF-8 encodings. Patterns in \
UTF-8 use two code positions for each of the vowels with acute \
accent (a.k.a tonos, oxia), e.g., U+03AC, U+1F71 for alpha."
LICENSE = "LPPL-1.0"

PV = "2026.226.5svn78069"

RPM_NAME = "texlive-hyphen-greek-2026.226.5svn78069-60.2.noarch.rpm"
RPM_HASH = "e0359dac4570ce17627a3a6060a948b027f360a2a575afbe38b146b8dfddc542dea44ebef25626699016fde6cd2e9f391e623b181ae4d6afd8ec7ef066d4af01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grmhyph5.tex \
tex-grphyph5.tex \
tex-hyph-el-monoton.tex \
tex-hyph-el-polyton.tex \
tex-loadhyph-el-monoton.tex \
tex-loadhyph-el-polyton.tex \
texlive-hyphen-greek"

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
