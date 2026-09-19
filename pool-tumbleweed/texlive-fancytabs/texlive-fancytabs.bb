SUMMARY = "Fancy page border tabs"
DESCRIPTION = "The package can typeset tabs on the side of a page. It requires \
TikZ from the pgf bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn41549"

RPM_NAME = "texlive-fancytabs-2026.226.1.9svn41549-59.2.noarch.rpm"
RPM_HASH = "eb59be5fa6b51dcd586b50b5727b877d33a16f046ab27465d34b9d104f2fa7aeba5da7fda011bacac7bdd31ea133ba84f242593241e05e13311cdf724e66f365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancytabs.sty \
texlive-fancytabs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
