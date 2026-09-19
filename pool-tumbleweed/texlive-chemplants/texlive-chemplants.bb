SUMMARY = "Symbology to draw chemical plants with TikZ"
DESCRIPTION = "This package offers tools to draw simple or barely complex \
schemes of chemical processes. The package defines several \
standard symbols and styles to draw process units and streams. \
The guiding light of the package is the UNICHIM regulation. All \
of the symbols and styles are defined using tools of the TikZ \
package, thus a basic knowledge of the logic of this powerful \
tool is required to profitably use chemplants."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.9svn60606"

RPM_NAME = "texlive-chemplants-2026.226.0.0.9.9svn60606-60.2.noarch.rpm"
RPM_HASH = "544785d93c2b6cd27bd7c4237f1c73764e1c9a938abfa85a1f77695813326cc182dc52d54da1a7f7056e7149e931bcac9b853ecef16b7eccf388f63624dc38e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemplants.sty \
texlive-chemplants"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
