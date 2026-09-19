SUMMARY = "French version of colour definitions from xcolor"
DESCRIPTION = "This package provides colours with French names, based on \
xcolor (svgnames, dvipsnames) and xkcd."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn76790"

RPM_NAME = "texlive-couleurs-fr-2026.226.0.0.1.4svn76790-61.2.noarch.rpm"
RPM_HASH = "4306ed2ec0bcf3125c9212e80e3ec9c6f9235f322e86314b006f8074804181d29dc8ce752e1b548452c59c5903011f542e5035f7fa80b9ab5c188b3f29ca06a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-couleurs-fr.sty \
texlive-couleurs-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
