SUMMARY = "Create text frames for posters, brochures or magazines"
DESCRIPTION = "The flowfram package enables you to create frames in a document \
such that the contents of the document environment flow from \
one frame to the next in the order in which they were defined. \
This is useful for creating posters or magazines, indeed any \
form of document that does not conform to the standard one or \
two column layout."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn78101"

RPM_NAME = "texlive-flowfram-2026.226.2.1svn78101-60.2.noarch.rpm"
RPM_HASH = "afb1923c5ea7fe56e4489a09b8a4cc0208126413027869389f2a7a389d8b5dc7615832f872e7d5e46ca3a54927e768c07a8008ba761384cdcf4bb0752643cfff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flowfram-2014-09-30.sty \
tex-flowfram-2025-08-23.sty \
tex-flowfram.sty \
tex-flowframtkutils.sty \
texlive-flowfram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-luatex85.sty \
tex-pgf.sty \
tex-pst-char.sty \
tex-rerunfilecheck.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
