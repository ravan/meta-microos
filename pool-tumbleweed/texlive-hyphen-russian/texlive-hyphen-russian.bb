SUMMARY = "Russian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Russian in T2A and UTF-8 encodings. \
For 8-bit engines, the 'ruhyphen' package provides a number of \
different pattern sets, as well as different (8-bit) encodings, \
that can be chosen at format-generation time. The UTF-8 version \
only provides the default pattern set. A mechanism similar to \
the one used for 8-bit patterns may be implemented in the \
future."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-russian-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "41eb506dc8e2416fa578280fdbb4731770277453b47c9a61e00cc821077d548f57e000db831d127cde28dec5dbcb9b5a4fd7351a8d664f6e21a89bd254846005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ru.t2a.tex \
tex-hyph-ru.tex \
tex-loadhyph-ru.tex \
texlive-hyphen-russian"

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
texlive-ruhyphen \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
