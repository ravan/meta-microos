SUMMARY = "LaTeX support for the TeX book symbols"
DESCRIPTION = "A LaTeX package for easy access to the symbols of the Knuth's \
'manual' font, such as the Dangerous Bend and Manual-errata \
Arrow."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-manfnt-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "99a5da07fad24c9b5b9b543d0b0cd3620536da26031c6dc2f6adf285531c6d989843c2f711ac6b415e8c7152a706dc488aeaa17478abbc2175c48587b80af50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manfnt.sty \
texlive-manfnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
