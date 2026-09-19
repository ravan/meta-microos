SUMMARY = "Extending \\hrulefill"
DESCRIPTION = "The package provides extended macros for the default \\hrulefill \
command. It allows modification of the width and the colour of \
the line."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-xhfill-2026.226.1.01svn77682-59.4.noarch.rpm"
RPM_HASH = "84ef396bf831af6a7c271a7a448bc0155b0266291416fd1ff9caff0a986a50fedaf71b26c4d846a8020e0e3eab52a8323300ff0b3beb13be0b6d9c5d9cf497c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xhfill.sty \
texlive-xhfill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
