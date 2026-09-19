SUMMARY = "Decorative chapter headings"
DESCRIPTION = "A package for creating decorative chapter headings with \
quotations. Uses graphical and coloured output and by default \
needs the 'Adobe standard font set' (as supported by psnfss)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-quotchap-2026.226.1.3svn77682-60.4.noarch.rpm"
RPM_HASH = "8365f94ca9e4467accdac80a0602177193b63b9a3ee6cf5eab91ff91b842909b9b4cdf45b67aa740ede3fbdb9d981ff3cfa94c159255a701859993f82fb510be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quotchap.sty \
texlive-quotchap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
