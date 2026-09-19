SUMMARY = "Draw colored represenations of complex functions"
DESCRIPTION = "Domain coloring is a technique to visualize complex functions \
by assigning a color to each point of the complex plane z=x+iy. \
This package calculates with the help of Lua any complex \
function to visualize its behaviour. The value of the complex \
function(z) can be described by radius and angle which can be \
two values of the hsv-color model, which then defines the color \
of each point in the complex plane z=x+iy."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.05svn72176"

RPM_NAME = "texlive-domaincoloring-2026.226.0.0.05svn72176-59.2.noarch.rpm"
RPM_HASH = "462bbf52deccf9410528914b1755537ed7c883581f6aa8afa6142c069f3a679b0a264df2a5a1e54f17462099b4cbd82fe6d85ddbd3c00f01c6fcc5a76dd4d1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-domaincoloring.sty \
texlive-domaincoloring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-shellesc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
