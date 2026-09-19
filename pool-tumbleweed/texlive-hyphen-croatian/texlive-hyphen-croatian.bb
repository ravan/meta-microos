SUMMARY = "Croatian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Croatian in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-croatian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "5ef0a07c2db1a304d4fe65854ace3b785f48990ddc730e8d75ada5ec55e8621ddbd4eaae7a77d3f3982d86d44b14d1232a275149f8d8863b94b429f5976a4642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hr.ec.tex \
tex-hyph-hr.tex \
tex-loadhyph-hr.tex \
texlive-hyphen-croatian"

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
