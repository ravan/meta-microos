SUMMARY = "Replace figures with a white box and additional features"
DESCRIPTION = "With this package you can control the outcome of a figure which \
is set to draft and modify the display with various options."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76790"

RPM_NAME = "texlive-draftfigure-2026.226.0.0.2svn76790-59.2.noarch.rpm"
RPM_HASH = "bd2a4cca8eecf6211488132d46e1bca70af78168171322a9e688bd2a8f046a8f23c1d44c69836b50d55883b1038e17cdadcbfddeba26853b8f3bb6af83ceee6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-draftfigure.sty \
texlive-draftfigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
