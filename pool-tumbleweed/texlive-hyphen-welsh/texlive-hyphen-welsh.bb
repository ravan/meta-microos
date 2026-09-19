SUMMARY = "Welsh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Welsh in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-welsh-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "079eceae989dc6a4900a79045e0adef55586e95968fcbe5698c711f5975d765fbfdf74ed7a45fafd32a8d13da041761f19af74fb4a1fc305db235874c30e93a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-cy.ec.tex \
tex-hyph-cy.tex \
tex-loadhyph-cy.tex \
texlive-hyphen-welsh"

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
