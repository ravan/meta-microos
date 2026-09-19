SUMMARY = "Extend the color package colour space"
DESCRIPTION = "The package makes the 216 'web-safe colours' available to the \
standard color package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn31490"

RPM_NAME = "texlive-colorweb-2026.226.1.3svn31490-60.2.noarch.rpm"
RPM_HASH = "2a2625510a001a8625b7f2a48c93e4cbe324460e462fe3d77507d2b84d13acf84bd5c45014b629b6915e817737727fdcf4ea8897851ae760e204bb1990d80453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorweb.sty \
texlive-colorweb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
