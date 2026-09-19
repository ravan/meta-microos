SUMMARY = "Esperanto hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Esperanto ISO Latin 3 and UTF-8 \
encodings. Note that TeX distributions don't ship any suitable \
fonts in Latin 3 encoding, so unless you create your own font \
support or want to use MlTeX, using native Unicode engines is \
highly recommended."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-esperanto-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "7a86f4ea8afce6da39029c39f89ba57dc394d621fc4511a0c1cacfff032f123ce267a3ac2576d4feed5a17cdc52599ee575ad6981a581d1f67595b3fb2435fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-eo.il3.tex \
tex-hyph-eo.tex \
tex-loadhyph-eo.tex \
texlive-hyphen-esperanto"

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
