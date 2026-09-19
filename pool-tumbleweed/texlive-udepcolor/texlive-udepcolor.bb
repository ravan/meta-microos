SUMMARY = "University of Piura (UDEP) institutional and corporate colors for digital and electronic media"
DESCRIPTION = "This package defines University of Piura (UDEP) institutional \
and corporate colors for digital and electronic media according \
to brand and style guidelines published by UDEP DIRCOM. The \
colors have been selected and implemented using the xcolor \
package and following the brand and visual identity guidelines \
of the University of Piura."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn69701"

RPM_NAME = "texlive-udepcolor-2026.226.1.0svn69701-60.2.noarch.rpm"
RPM_HASH = "f7ac8269d9fe8b74356ee5b5d66e07d3bb0d9e19b176853343b78ef4db4624d4c14cf7414948340823972a07e8c2d38e6dc1d542c71627095cafb136f4f2dbf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-udepcolor.sty \
texlive-udepcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
