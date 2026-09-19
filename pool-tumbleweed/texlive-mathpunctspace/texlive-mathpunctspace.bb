SUMMARY = "Control the space after punctuation in math expressions"
DESCRIPTION = "This package provides a mechanism to control the space after \
commas and semicolons in mathematical expressions."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn46754"

RPM_NAME = "texlive-mathpunctspace-2026.226.1.1svn46754-59.2.noarch.rpm"
RPM_HASH = "2a013f9d3cc51e44fd7452080628cfa39db1540bf49dc211569619a1eda5aafe72fc0fe8f9250ec9729791311a5a69fb0e6a805c299354e354d2d88afd424aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathpunctspace.sty \
texlive-mathpunctspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
