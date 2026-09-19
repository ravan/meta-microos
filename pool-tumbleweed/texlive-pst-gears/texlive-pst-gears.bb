SUMMARY = "Drawing internal and external gears"
DESCRIPTION = "The macro \\pstgears[options](x,y) allows, among other things, \
the drawing of a gear consisting of two or more external gears \
whose profile is an involute arc."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn77113"

RPM_NAME = "texlive-pst-gears-2026.226.0.0.61svn77113-59.2.noarch.rpm"
RPM_HASH = "c37240bb1c8876e822815cd1fef697a6733bce090864b25f8cfac162db166ac6d5c4ac928c65565f3ccd446cf715ae8bd4e062979366baefab629c88a153f314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-gears.sty \
tex-pst-gears.tex \
texlive-pst-gears"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
