SUMMARY = "Type 1 version of Calligra"
DESCRIPTION = "This is a conversion (using mf2pt1) of Peter Vanroose's \
handwriting font."
LICENSE = "LPPL-1.0"

PV = "2026.226.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-2026.226.001.000svn24302-59.2.noarch.rpm"
RPM_HASH = "28cdcb3128ead8df5705a3de430937951d08762a81afc5fd7629e7fa04a7ed56fd9b3ff5e85468ee78a117ce56036d823fdfae211e5a6e2a1b240aa89bdb6022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calligra.map \
texlive-calligra-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-calligra-type1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
