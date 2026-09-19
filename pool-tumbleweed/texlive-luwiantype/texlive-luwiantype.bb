SUMMARY = "Typesetting package for Hieroglyphic Luwian"
DESCRIPTION = "This package allows for typing in Hieroglyphic Luwian in LaTeX \
documents, using relatively simple commands based on the Latin \
transcriptions of the various signs. It also includes some \
formatting commands designed to allow boustrophedon and \
columns, as well as shorthands for symbols commonly used in \
transcriptions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn73719"

RPM_NAME = "texlive-luwiantype-2026.226.1.3svn73719-59.2.noarch.rpm"
RPM_HASH = "fc3c34667081da6ec8e885e6a442128390259a76590f9b3edb56125e4b701dc07fad7b6187c82d18d7ddead6f6351bab44086295b7478b421137581aa83e4b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luwiantype.sty \
texlive-luwiantype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-graphicx.sty \
tex-moresize.sty \
tex-stackengine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luwiantype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
