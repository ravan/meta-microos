SUMMARY = "Armenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Armenian for Unicode engines. \
Auto-generated from a script included in hyph-utf8."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-armenian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "41662277292d41d028f07807c41d91471923eca5397188ef662af986e23e2c0cfdc74284dcf8c33d2e029aa71d28a022a4edf02cca9cd00b33d923d74299aebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hy.tex \
tex-loadhyph-hy.tex \
texlive-hyphen-armenian"

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
