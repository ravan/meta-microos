SUMMARY = "A CV document class with a vertical timeline for experience"
DESCRIPTION = "The class offers another modern, neat, design, and provides a \
simple means of adding an 'experience timeline'."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-2026.226.1.0svn26543-60.4.noarch.rpm"
RPM_HASH = "a2bc07a1766a837a08f9aa929bac8476c7048415074b2e2ef5c5a41f888cd7c2367b6160b5eb94020fe07b2b24c97912ddadcf7732c61ac1f4f1a13b7ec30f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harnon-cv.cls \
texlive-harnon-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-cantarell.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-nopageno.sty \
tex-tabularx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
