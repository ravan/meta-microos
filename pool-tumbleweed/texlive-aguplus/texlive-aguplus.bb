SUMMARY = "Styles for American Geophysical Union"
DESCRIPTION = "This bundle started as an extension to the AGU's own published \
styles, providing extra facilities and improved usability. The \
AGU now publishes satisfactory LaTeX materials of its own; the \
author of aguplus recommends that users switch to using the \
official distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6bsvn17156"

RPM_NAME = "texlive-aguplus-2026.226.1.6bsvn17156-61.2.noarch.rpm"
RPM_HASH = "01351147eb61f1752b5e6fc1f90815d6e8a19c2b1c39c6a34fe5f4f0ed1251fa127baab853e1787f69bdb973378677ede4854a6dc2b9a16a80382a9aee0c2305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aguplus.cls \
tex-aguplus.sty \
tex-agupp.sty \
texlive-aguplus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
