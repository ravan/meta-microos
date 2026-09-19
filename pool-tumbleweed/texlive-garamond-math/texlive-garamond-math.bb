SUMMARY = "An OTF math font matching EB Garamond"
DESCRIPTION = "Garamond-Math is an open type math font matching EB Garamond \
(Octavio Pardo) and EB Garamond (Georg Mayr-Duffner). Many \
mathematical symbols are derived from other fonts, others are \
made from scratch. The metric is generated with a Python \
script. Issues, bug reports and other contributions are \
welcome."
LICENSE = "OFL-1.1"

PV = "2026.226.svn61481"

RPM_NAME = "texlive-garamond-math-2026.226.svn61481-60.2.noarch.rpm"
RPM_HASH = "1ffffcae4ec9091f21152653c18507b7114340571880ee91be9e10f6e9c102a345e1af025a2f11efb3a886a9ad08f461b930083c391d823fb405e71b74f3ecda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-garamond-math-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
