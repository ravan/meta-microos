SUMMARY = "Typeset PSTricks examples, with code"
DESCRIPTION = "The (PSTricks-related) package provides an environment \
PSTexample to put code and output side by side or one above the \
other."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn45289"

RPM_NAME = "texlive-pst-exa-2026.226.0.0.06svn45289-59.2.noarch.rpm"
RPM_HASH = "3b6d5908360a22d69ec335528b4530b2b6252b099f7eba775da0a687716920b5528c56041d08e85247c480b65f403c0ec3846c698647d7b8e38393445e607c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-exa.sty \
texlive-pst-exa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-changepage.sty \
tex-etoolbox.sty \
tex-showexpl.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
