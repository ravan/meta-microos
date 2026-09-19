SUMMARY = "Generate documents with and without answers by toggling a switch"
DESCRIPTION = "This package can generate documents with and without answers \
from a single file by toggling a switch. However, it can only \
be used to create documents to be printed on paper."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn72949"

RPM_NAME = "texlive-hideanswer-2026.226.1.2svn72949-60.4.noarch.rpm"
RPM_HASH = "407ee67dd1b5ef9017d52f0e1c7ee97ca526343c6dc741ccf55a1e6ce70c81a65c4428fd3f59a90ca053cdddf7ee30d50f03b9af8e4aff881a31311b48ecf167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hideanswer.sty \
texlive-hideanswer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
