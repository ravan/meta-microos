SUMMARY = "Filling with colour gradients, using PSTricks"
DESCRIPTION = "The package fills with colour gradients, using PSTricks. The \
RGB, CMYK and HSB models are supported. Other colour gradient \
mechanisms are to be found in package pst-slpe."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn77682"

RPM_NAME = "texlive-pst-grad-2026.226.1.06svn77682-59.2.noarch.rpm"
RPM_HASH = "cebef997429b09787009a3669745db7947c423f726b59d3c5ca0a6fc6477727bdb9be0e7d46e83fc753630b092c2be040a7e3ffa424a0199dd0c39ee11016bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-grad.sty \
tex-pst-grad.tex \
texlive-pst-grad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
