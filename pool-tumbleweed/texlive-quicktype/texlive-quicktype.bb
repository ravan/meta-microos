SUMMARY = "LaTeX package for quick typesetting"
DESCRIPTION = "Intended for the quick typesetting of basic documents using \
LaTeX using shortcuts to existing commands and specific \
commands for quick formatting and creation of tables and title \
pages with a graphic image."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-2026.226.0.0.1svn42183-60.4.noarch.rpm"
RPM_HASH = "87e444904f0338b84df4b617a2ac2e2b634276369031e74138cd7daf16b4aa7e61aa2014d1265ddcec3655c020c2892c731214a1b5ca2f4475c9d5dca5711cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quicktype.sty \
texlive-quicktype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
