SUMMARY = "A package for creating a curriculum vitae"
DESCRIPTION = "The package is distributed with two example files; they (and \
their formatted output) constitute the only real documentation. \
Note that cv is just a package: you choose the overall \
formatting by deciding which class to use, while the package \
provides the detailed formatting."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cv-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "423d0b979da1f353c645afb71affab5ad5c405f156a62e28c4ed1471cbc1d4df503967861db23e6aac89733805fa1f7ac8eaa35159be9349fadf2c8e3a4ccbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CV.sty \
texlive-cv"

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
