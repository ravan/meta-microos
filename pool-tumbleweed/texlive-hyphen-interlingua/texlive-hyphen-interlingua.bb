SUMMARY = "Interlingua hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Interlingua in ASCII encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-interlingua-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "246243b17bfaf214dfe49595604bd204ab34477290cac4535e59070f4898e27e5efb65d9d111939f8467b47c99571b1a74ec107865dec091b0f1a0a79e0caa44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ia.tex \
tex-loadhyph-ia.tex \
texlive-hyphen-interlingua"

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
