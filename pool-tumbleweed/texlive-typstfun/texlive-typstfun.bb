SUMMARY = "List of equivalent Typst function names of LaTeX commands"
DESCRIPTION = "This documentation lists equivalent Typst function names of \
LaTeX commands. Only math symbols provided by the LaTeX format \
or the amsmath bundle are included."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024asvn70018"

RPM_NAME = "texlive-typstfun-2026.226.2024asvn70018-59.2.noarch.rpm"
RPM_HASH = "55658ea262a324a2f3773d40534555cdff8c055e89009ca72989cc7bb5d868f3c898ada16258f5156e3a8d8d84d1ea9d589131a2d05fd46304d764564c0b74fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typstfun"

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
