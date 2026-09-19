SUMMARY = "Font for graphical symbols used in crystallography"
DESCRIPTION = "The font is provided as an Adobe Type 1 font, and as Metafont \
source. Instructions for use are available both in the README \
file and (with a font diagram) in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cryst-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "b4b73c8fc9b626f4df4b06227b3717785227403684a3dbbfea8798e53f588b946c92777af8872ba5efe09844864645d6cdabfe3ec5d4e4808024caf9ab071ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cryst.tfm \
texlive-cryst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cryst-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
