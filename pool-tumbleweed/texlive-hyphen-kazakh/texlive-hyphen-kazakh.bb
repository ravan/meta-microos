SUMMARY = "Kazakh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Kazakh in T2A and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-kazakh-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "724dce1c5949e61338c495ae209033ac759a0d2727615d9c353e6d078337202d65c86d2f94a04447c94b7de7a3ba9cdcffec670fad240082f380b62accad2c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-kk.t2a.tex \
tex-hyph-kk.tex \
tex-loadhyph-kk.tex \
texlive-hyphen-kazakh"

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
