SUMMARY = "Template for a simple presentation"
DESCRIPTION = "This package provides a simple and clear LaTeX template for \
creating professional presentations. Featuring dark blue as its \
primary color, the theme prioritizes clarity and readability, \
making it an excellent choice for researchers, educators, and \
students."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn73454"

RPM_NAME = "texlive-beamertheme-simpledarkblue-2026.226.1.1svn73454-61.2.noarch.rpm"
RPM_HASH = "dccf922f01658b8eeb4530e8d3d2a54608a6fe941e7b9ecf0b42e1554fd786f428587ff94d3602713e9112848ecc98e9b31714b1b83428d94d0e36ae1542aa5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSimpleDarkBlue.sty \
tex-beamerfontthemeSimpleDarkBlue.sty \
tex-beamerinnerthemeSimpleDarkBlue.sty \
tex-beamerthemeSimpleDarkBlue.sty \
texlive-beamertheme-simpledarkblue"

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
