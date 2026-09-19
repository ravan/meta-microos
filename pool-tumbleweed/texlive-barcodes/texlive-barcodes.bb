SUMMARY = "Fonts for making barcodes"
DESCRIPTION = "The package deals with EAN barcodes; Metafont sources for fonts \
are provided, and a set of examples; for some codes, a small \
Perl script is needed."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-barcodes-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "fc452216ff31cc92f069701db0773092438013905c1f160aaab9131ba409897081b9842edd88b98dd5c480a31d2f07f59cd19a5d76efda9282705cbf41ea6722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barcodes.sty \
tex-wlc11.tfm \
tex-wlc128.tfm \
tex-wlc39.tfm \
tex-wlc93.tfm \
tex-wlcr39.tfm \
texlive-barcodes"

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
