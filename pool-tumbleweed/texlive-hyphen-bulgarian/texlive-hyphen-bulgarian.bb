SUMMARY = "Bulgarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Bulgarian in T2A and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-bulgarian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "656f2dc1067456132c91f64e882ee97ee92db8a273a849825cf38cbb726879df1377c2c1130b6ae4d9049d60d75409ef46f815708f9487ccf8945b3aed9ba3af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-bg.t2a.tex \
tex-hyph-bg.tex \
tex-loadhyph-bg.tex \
texlive-hyphen-bulgarian"

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
