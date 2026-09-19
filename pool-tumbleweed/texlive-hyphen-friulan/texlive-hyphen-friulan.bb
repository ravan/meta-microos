SUMMARY = "Friulan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Friulan in ASCII encoding. They are \
supposed to comply with the common spelling of the Friulan \
(Furlan) language as fixed by the Regional Law N.15/96 dated \
November 6, 1996 and its following amendments."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-friulan-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "5f68033549638feb9d7beee29474b0fd054432dbe3f035d799ab72b1e6f7c365addc77a01325f784e6d7401b5dde82b027d26722d75ba61646c29e1b2b186e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fur.ec.tex \
tex-hyph-fur.tex \
tex-hyph-quote-fur.tex \
tex-loadhyph-fur.tex \
texlive-hyphen-friulan"

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
