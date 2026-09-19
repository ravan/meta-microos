SUMMARY = "Free replacement for basic MathTime fonts"
DESCRIPTION = "This package replaces the original MathTime fonts, not \
MathTime-Plus or MathTime Professional (the last being the only \
currently available commercial bundle)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn66115"

RPM_NAME = "texlive-belleek-2026.226.svn66115-61.2.noarch.rpm"
RPM_HASH = "4175cb3982d67d47159856d40359e2b5624348dfca2b82da5c9d3be12ab1765d8f828324c9bb753e1bdce88fc7646b7e97326f470c486a75cb3ac93e32b85dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-belleek.map \
texlive-belleek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-belleek-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
