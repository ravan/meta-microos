SUMMARY = "Draw networks with TikZ"
DESCRIPTION = "This package allows the creation of images of complex networks \
that are seamlessly integrated into the underlying LaTeX files. \
The package requires datatool, etex, graphicx, tikz, \
trimspaces, xifthen, and xkeyval."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn51884"

RPM_NAME = "texlive-tikz-network-2026.226.1.1svn51884-59.2.noarch.rpm"
RPM_HASH = "4a7003a4b8e1ccc1adc48e76d5b1e642f26e3d2a9fd76d871c23079c38ea9e256aa18e4dc9d951cea0628c8424779d54ebb7a0ed35ee8a3248f97fca79bf3a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-network.sty \
texlive-tikz-network"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-etex.sty \
tex-graphicx.sty \
tex-tikz.sty \
tex-trimspaces.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
