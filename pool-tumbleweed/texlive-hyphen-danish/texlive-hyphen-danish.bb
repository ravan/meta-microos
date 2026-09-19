SUMMARY = "Danish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Danish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-danish-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "9a68bf23f4235145cfa43b7cdb2eec47a53049c49e4e4fe8ddb7ea2d2f576e5469a4ddfa5e271adc927507295189a3ece6ac9629c6a20313cca2edaa9dffbd4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-da.ec.tex \
tex-hyph-da.tex \
tex-loadhyph-da.tex \
texlive-hyphen-danish"

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
