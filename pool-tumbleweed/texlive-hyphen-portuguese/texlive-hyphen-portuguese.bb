SUMMARY = "Portuguese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Portuguese in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-portuguese-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "867c45f538e84ed56917db192d5193f94ac57ff6d106fbac638bfa4b4dcbfe916806866956fc52c2715b9f6d45b36c03aaae2ec2529746c9ba9310630418d58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pt.ec.tex \
tex-hyph-pt.tex \
tex-loadhyph-pt.tex \
texlive-hyphen-portuguese"

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
