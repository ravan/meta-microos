SUMMARY = "Basque hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Basque in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-basque-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "9880e03d440957008167e50adf3100bb9bdefeed133e720c5f9ff8719811d5f68ab7d33c87a1d86eb04230aead2f3c3d0b8f326674aab600296979e1dde0ce49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-eu.ec.tex \
tex-hyph-eu.tex \
tex-loadhyph-eu.tex \
texlive-hyphen-basque"

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
