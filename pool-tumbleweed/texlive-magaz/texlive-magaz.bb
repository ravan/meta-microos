SUMMARY = "Magazine layout"
DESCRIPTION = "The current version does special formatting for the first line \
of text in a paragraph. The package is part of a larger body of \
tools which remain in preparation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-magaz-2026.226.0.0.4svn77682-59.2.noarch.rpm"
RPM_HASH = "2c90808e77123db03c66b775fbd2e61060e8c19a1cec5eb69eddeb96cd3cd247e693f8d7d9167ee4e1f1972edaf08e05b16c7eaddfc27a4c06a3697ba67afa80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magaz.sty \
texlive-magaz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
