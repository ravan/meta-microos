SUMMARY = "Miscellaneous macros from Joachim Schrod"
DESCRIPTION = "A bunch of packages, including: idverb.tex, for 'short \
verbatim'; xfig.tex, for including xfig/transfig output in a \
TeX document; and cassette.tex for setting cassette labels."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn16211"

RPM_NAME = "texlive-js-misc-2026.226.svn16211-63.2.noarch.rpm"
RPM_HASH = "445ffb24289ba5c6999605f198117aa1bcaba0d3d1247e23b653d70f51c5a7e5461472de0175f98729dd57d4e0427897888985cd1acddc77f573468d41e73d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cassette.tex \
tex-idverb.tex \
tex-js-misc.tex \
tex-schild.tex \
tex-sperr.tex \
tex-xfig.tex \
texlive-js-misc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
