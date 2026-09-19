SUMMARY = "Logos for The Hague University of Applied Sciences (THUAS)"
DESCRIPTION = "This package contains some logos of The Hague University of \
Applied Sciences (THUAS). These Logos are available in English \
and in Dutch. They are rendered via PGF."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2svn51347"

RPM_NAME = "texlive-thuaslogos-2026.227.1.2svn51347-62.2.noarch.rpm"
RPM_HASH = "3b4614ade095a69797af5b05a1e4546236e183540fec32cf94d57f4a85bee8cf07b08331dd5a8ba2823f3371b5ec011c18631e7155f75c93c2b1e3cb2f47adcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thuaslogos.sty \
texlive-thuaslogos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
