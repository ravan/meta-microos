SUMMARY = "Vertical alignment of content inside table cells"
DESCRIPTION = "This package offers low-level macros to build rows with \
vertically-aligned cells (top, middle or bottom) and calculate \
the height of a row. These cells can have variable or fixed \
height and can be paragraph-cells or inline-cells. Different \
vertical alignments can be used in the same row."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77682"

RPM_NAME = "texlive-vcell-2026.226.1.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "596416e4a2b465c51a50fb5bb7643e6b2ce7f32d8dab4789e3786aa37200dfd4714f0f5d4ecb246159c7e0e7b43162986e87d517f0ef7accf9aa311b390a347c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vcell.sty \
texlive-vcell"

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
