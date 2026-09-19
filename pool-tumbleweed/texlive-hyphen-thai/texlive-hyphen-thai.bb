SUMMARY = "Thai hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Thai in LTH and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-thai-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "4ce7c2ba35b6c6a531c455bff078a5d39744909cd3719f7bebae1f1585e9ac4f8f2247d6638ced20fde575ce7d1e59667b24ccd4a78c52dad3a46598c1a9d6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-th.lth.tex \
tex-hyph-th.tex \
tex-loadhyph-th.tex \
texlive-hyphen-thai"

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
