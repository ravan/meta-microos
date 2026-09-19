SUMMARY = "Print UPC-A barcodes"
DESCRIPTION = "The package defines a single macro \\upca, to print UPC-A \
barcodes."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22511"

RPM_NAME = "texlive-upca-2026.226.svn22511-60.2.noarch.rpm"
RPM_HASH = "9add88505f8897b3f98eff6c314c8d348940d8eeface93f49e1b9e8f3547754fc8302d88f79d565e18a30b3f3d19a92199ce485ad57c273fabb8293c99c73f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upca.tex \
texlive-upca"

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
