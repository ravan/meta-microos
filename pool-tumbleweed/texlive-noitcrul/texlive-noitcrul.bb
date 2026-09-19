SUMMARY = "Improved underlines in mathematics"
DESCRIPTION = "The package provides a (maths mode) \\underline variant which \
doesn't impose italics correction at the end."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-noitcrul-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "290bc12ee8b4a096f43344024153c5d2bb1fe86d2903073fa30e80039fb3e16c0f955d25fb7f8eb9ebcb9daa321051294094e222f9ab88a33f4e4cfc62857931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noitcrul.sty \
texlive-noitcrul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-robustcommand.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
