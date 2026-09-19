SUMMARY = "A small package to set arbitrary sizes for the main font of the document"
DESCRIPTION = "The package allows you to set arbitrary sizes for the main font \
of the document, through the fontsize=<size> option."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-fontsize-2026.226.0.0.9svn78101-60.2.noarch.rpm"
RPM_HASH = "3619f83036025b18af37cddb23c503d645e59142bc221a72de1ccc136283b4db97c61abb4de48de08024b6d30b9b287073eaa77c4bb9f752827e9886ed564f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontsize.sty \
texlive-fontsize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xfp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
