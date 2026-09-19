SUMMARY = "A font to typeset the Philokalia Books"
DESCRIPTION = "The philokalia package has been designed to ease the use of the \
Philokalia-Regular OpenType font with XeLaTeX. The font started \
as a project to digitize the typeface used to typeset the \
Philokalia books."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn45356"

RPM_NAME = "texlive-philokalia-2026.226.1.2svn45356-58.2.noarch.rpm"
RPM_HASH = "3f7c72e1a131dd9510fb2e43e63e2f90b710f6204311ce75ebafc56f6c351489df6f09bb6df20965149fbc47d5bb17c37f00f019dbf802d686441df5aa46ac37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-philokalia.sty \
tex-tuplk.fd \
texlive-philokalia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lettrine.sty \
tex-xltxtra.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-philokalia-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
