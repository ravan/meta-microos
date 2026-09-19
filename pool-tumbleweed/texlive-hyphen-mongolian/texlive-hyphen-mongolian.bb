SUMMARY = "Mongolian hyphenation patterns in Cyrillic script"
DESCRIPTION = "Hyphenation patterns for Mongolian in T2A, LMC and UTF-8 \
encodings. LMC encoding is used in MonTeX. The package includes \
two sets of patterns that will hopefully be merged in future."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-mongolian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "ae1f20e9dfcafde80b3ab2f6e0bd7bcb55cf53e8c65452bdaf116c25021145d6ca5e34298c9e09cb4d05b0b086f271afbcd6f2fb73a84988b00d53d267588fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mn-cyrl-x-lmc.lmc.tex \
tex-hyph-mn-cyrl-x-lmc.tex \
tex-hyph-mn-cyrl.t2a.tex \
tex-hyph-mn-cyrl.tex \
tex-loadhyph-mn-cyrl-x-lmc.tex \
tex-loadhyph-mn-cyrl.tex \
texlive-hyphen-mongolian"

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
