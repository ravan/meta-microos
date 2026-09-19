SUMMARY = "Support for formatting SPIE Proceedings manuscripts"
DESCRIPTION = "A class and a BibTeX style are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.25svn75447"

RPM_NAME = "texlive-spie-2026.226.3.25svn75447-64.2.noarch.rpm"
RPM_HASH = "a40712db860e1d33fdde0864a807875503135052e77576e0334a0b775007029b3a3f6f8e14057e942762863dd742af7015c4babd6c2f7629e3538cb507f023ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spie.cls \
texlive-spie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
