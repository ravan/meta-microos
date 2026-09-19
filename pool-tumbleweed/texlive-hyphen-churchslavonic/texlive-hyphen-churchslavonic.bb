SUMMARY = "Church Slavonic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Church Slavonic in UTF-8 encoding"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-churchslavonic-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "ecefc872a0e806cc7e1d026d03add43005405c9755496ed96e6486066aa872120634ea6d387be00141065ec481d5cf562b47680b5df1c60b5b43e2b0608a7ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-cu.tex \
tex-loadhyph-cu.tex \
texlive-hyphen-churchslavonic"

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
