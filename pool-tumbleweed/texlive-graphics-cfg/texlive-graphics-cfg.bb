SUMMARY = "Sample configuration files for LaTeX color and graphics"
DESCRIPTION = "This bundle includes color.cfg and graphics.cfg files that set \
default 'driver' options for the color and graphics packages. \
It contains support for defaulting the new LuaTeX option which \
was added to graphics and color in the 2016-02-01 release. The \
LuaTeX option is only used for LuaTeX versions from 0.87, older \
versions use the pdfTeX option as before."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn41448"

RPM_NAME = "texlive-graphics-cfg-2026.226.svn41448-60.4.noarch.rpm"
RPM_HASH = "2f8b2791dfbbfe5732e6b05ce4f6a740ee2cf17792eb8a6ac71431e07a3a8f1a33b07de0b591ad86592aba08f38863c6e717ac2a14b43783cd9476c6b034f4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color.cfg \
tex-graphics.cfg \
texlive-graphics-cfg"

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
