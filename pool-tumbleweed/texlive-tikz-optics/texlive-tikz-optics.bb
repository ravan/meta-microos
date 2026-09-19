SUMMARY = "A library for drawing optical setups with TikZ"
DESCRIPTION = "This package provides a new TikZ library designed to easily \
draw optical setups with TikZ. It provides shapes for lens, \
mirror, etc. The geometrically (in)correct computation of light \
rays through the setup is left to the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.3svn62977"

RPM_NAME = "texlive-tikz-optics-2026.226.0.0.2.3svn62977-59.2.noarch.rpm"
RPM_HASH = "d40648422fc971f6157ba4274b13111a8f856dda12aae1415886c7a9bd95f697fe4251b84609d0339e2ec897fa22793b2e5895bc581056d1d6a5d0d00593e52b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryoptics.code.tex \
texlive-tikz-optics"

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
