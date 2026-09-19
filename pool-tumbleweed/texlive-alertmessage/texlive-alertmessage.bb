SUMMARY = "Alert messages for LaTeX"
DESCRIPTION = "Some macros to display alert messages (informational, error, \
warning and success messages)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-alertmessage-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "f3c6d143173943f87ef6301e2a0cd3a36c4b1c5abe8507f8b284f20daf06d4455108a5fb3faf037c20067af8982b5b4efbf8bbf2a726178809d665bee609100c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alertmessage.sty \
texlive-alertmessage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-picture.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
