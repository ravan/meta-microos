SUMMARY = "Kurmanji hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Kurmanji (Northern Kurdish) as spoken \
in Turkey and by the Kurdish diaspora in Europe, in T1/EC and \
UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-kurmanji-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "57f9d967a13f900dc0033a921ce14bc1277e006a81bfed6f0b801eb1bb7ac84cb6c1ec57914c34be4d7b9bfcf8a763d38ecd35aca98f8f767b5512e98bacf078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-kmr.ec.tex \
tex-hyph-kmr.tex \
tex-loadhyph-kmr.tex \
texlive-hyphen-kurmanji"

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
