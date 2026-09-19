SUMMARY = "Beamer themes for Boston College and the University of Pennsylvania"
DESCRIPTION = "Beamer themes in the colors of the University of Pennsylvania, \
USA, and Boston College, USA. Both were tested for the \
presentation theme 'Warsaw'. Please note that these color \
themes are neither official nor exact! The colours are \
approximated from the universities' style guidelines and \
websites, and slightly modified where necessary to generate an \
appealing look. The universities neither endorse, nor provide \
any support for, these color themes. I give no warranty for the \
code."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29937"

RPM_NAME = "texlive-beamertheme-upenn-bc-2026.226.1.0svn29937-61.2.noarch.rpm"
RPM_HASH = "a18054cddd9e249a02788b6f43294d9820d8bec7ec91ee6f03ec290ff9177757a35542033289b4d21562d0a09972801b8cced9875a41b558b57bda62c125331c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemegoeagles.sty \
tex-beamercolorthemepenn.sty \
texlive-beamertheme-upenn-bc"

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
