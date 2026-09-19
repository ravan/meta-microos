SUMMARY = "Slovenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovenian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-slovenian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "3d4dfaa0112d1fb4ca70b60ca3a7848dff3db6482e685d4d27767b382f1c84c262ead492847547f7cf4b127621c7d952eec13bf868d38593a9f959e45fc75bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sl.ec.tex \
tex-hyph-sl.tex \
tex-loadhyph-sl.tex \
texlive-hyphen-slovenian"

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
