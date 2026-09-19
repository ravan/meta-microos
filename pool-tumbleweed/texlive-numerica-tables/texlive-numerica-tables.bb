SUMMARY = "Create multi-column tables of mathematical functions"
DESCRIPTION = "The package defines a command to create possibly multi-column \
tables of mathematical function values. Key = value settings \
produce a wide variety of table styles consistent with the \
booktabs package (required). Also required are the packages \
numerica, l3kernel, l3packages, amsmath and mathtools."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.0svn77682"

RPM_NAME = "texlive-numerica-tables-2026.226.3.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "c7ebffd934c7c64fb789787563194d3be2eb720a5ec4d18277b2bab094841eca3a80ef5f5b874e2fb76bd5ee3d9bd4a841915f362158edd030b9294f7eb9f7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica-tables.sty \
texlive-numerica-tables"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
