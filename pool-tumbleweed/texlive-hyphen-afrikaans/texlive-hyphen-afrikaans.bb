SUMMARY = "Afrikaans hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Afrikaans in T1/EC and UTF-8 \
encodings. OpenOffice includes older patterns created by a \
different author, but the patterns packaged with TeX are \
considered superior in quality."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-afrikaans-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "ad43088ca1c400372a004adab2f123a7ccc9a0ff54a13b8ef499d21c8b4a53a39fc78c0604270becc73e0f9a284027a1d235a83857650b3ac8a1c94fdda903f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-af.ec.tex \
tex-hyph-af.tex \
tex-hyph-quote-af.tex \
tex-loadhyph-af.tex \
texlive-hyphen-afrikaans"

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
