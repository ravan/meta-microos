SUMMARY = "Turkish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkish in T1/EC and UTF-8 encodings. \
Auto-generated from a script included in the distribution. The \
patterns for Turkish were first produced for the Ottoman Texts \
Project in 1987 and were suitable for both Modern Turkish and \
Ottoman Turkish in Latin script, however the required character \
set didn't fit into EC encoding, so support for Ottoman Turkish \
had to be dropped to keep compatibility with 8-bit engines."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-turkish-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "b090c75c151c999fc553113e4756cbcfe7cce09092d8ebd52cda53df0e9682a90ddfb7172db1f71861cff82ef41dc974c68ddce32392ebe9275a5de0864cfa7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-tr.ec.tex \
tex-hyph-tr.tex \
tex-loadhyph-tr.tex \
texlive-hyphen-turkish"

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
