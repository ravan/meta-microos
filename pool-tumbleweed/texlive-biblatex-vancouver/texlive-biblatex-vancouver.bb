SUMMARY = "Vancouver style for BibLaTeX"
DESCRIPTION = "This package provides the Vancouver reference style for \
BibLaTeX. It is based on the numeric style and requires biber."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn75301"

RPM_NAME = "texlive-biblatex-vancouver-2026.226.0.0.1svn75301-61.2.noarch.rpm"
RPM_HASH = "cb54c79542a0206a338c284e6033f7696df9b77a43319e61717e56593b8bf4218a02cf082d196bc981bba88546dd8e2885e128fdcc4e5ea00120762693442cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vancouver.bbx \
tex-vancouver.cbx \
texlive-biblatex-vancouver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-numeric.bbx \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
