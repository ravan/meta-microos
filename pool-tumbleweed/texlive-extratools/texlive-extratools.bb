SUMMARY = "Utilities like DviToDvi, PSToPS, and LaCheck"
DESCRIPTION = "The LaCheck utility is a syntax checker for LaTeX documents. \
 \
The DviToDvi utilities are \
 \
dvibook       rearranges pages into book signatures, adds blank pages \
              as needed \
dviselect     selects pages and page ranges \
dvitodvi      performs general page rearrangement of selected pages \
dviconcat     concatenation of DVI files \
 \
Three simple scripts for scaling DIN A4 pages and rearranging two by \
two onto a DIN A4 page (a4toa5) are included. The number of pages must \
be even (which can be done by odd2even or dvibook)."
LICENSE = "GPL-2.0-or-later & LPPL-1.0 & LGPL-2.1-or-later"

PV = "2026.222"

RPM_NAME = "texlive-extratools-2026.222-68.2.noarch.rpm"
RPM_HASH = "0c7140ad237877a0f27978b5b081f5cb857227e97e79084c94b42c100239c9d0ce5993a0300f68a0b7c1952e86dcf37fc230d21ef0019b731c040707a04e8fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extratools"

RDEPENDS:${PN} += "psutils \
texlive-dviasm \
texlive-dvidvi \
texlive-dvipng \
texlive-dvisvgm \
texlive-lacheck \
texlive-seetexk"

inherit rpm
