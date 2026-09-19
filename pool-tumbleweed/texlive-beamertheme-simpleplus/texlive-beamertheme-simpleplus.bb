SUMMARY = "A simple and clean theme for LaTeX beamer"
DESCRIPTION = "This package provides a simple and clean theme for LaTeX \
Beamer. It can be used for academic and scientific \
presentations."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn73362"

RPM_NAME = "texlive-beamertheme-simpleplus-2026.226.1.1svn73362-61.2.noarch.rpm"
RPM_HASH = "02f87ac89bcd54fa26f6b03d197b152e1e72192bfcc2566ec3804abf0c110d58b7b8c04a20c50cad0264ff280552237a1cac851e2e733bc6037a655f746caff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSimplePlus.sty \
tex-beamerfontthemeSimplePlus.sty \
tex-beamerinnerthemeSimplePlus.sty \
tex-beamerthemeSimplePlus.sty \
texlive-beamertheme-simpleplus"

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
