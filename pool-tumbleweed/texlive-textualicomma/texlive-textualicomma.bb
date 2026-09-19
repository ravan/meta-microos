SUMMARY = "Use the textual comma character as decimal separator in math mode"
DESCRIPTION = "The package is based on the icomma package, and intended as a \
solution for situations where the text comma character discerns \
from the math comma character, e.g. when fonts without math \
support are involved. Escaping to text mode every time a comma \
is used in math mode may slow down the compilation process."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn76924"

RPM_NAME = "texlive-textualicomma-2026.227.1.1svn76924-62.2.noarch.rpm"
RPM_HASH = "72bfd942eedb7a3ed51bb7ebeaf200d69a49bddfd28fb3c43822184d9248dbdcc4e99ea31bac8c11659e6db3fe44904717b73ac308faeac033909d161f93e31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textualicomma.sty \
texlive-textualicomma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
