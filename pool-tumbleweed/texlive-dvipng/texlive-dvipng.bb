SUMMARY = "A fast DVI to PNG/GIF converter"
DESCRIPTION = "This program makes PNG and/or GIF graphics from DVI files as \
obtained from TeX and its relatives. Its benefits include: \
Speed. It offers very fast rendering of DVI as bitmap files, \
which makes it suitable for generating large amounts of images \
on-the-fly, as needed in preview-latex, WeBWorK and others; It \
does not read the postamble, so it can be started before TeX \
finishes. There is a --follow switch that makes dvipng wait at \
end-of-file for further output, unless it finds the POST marker \
that indicates the end of the DVI; Interactive query of \
options. dvipng can read options interactively through stdin, \
and all options are usable. It is even possible to change the \
input file through this interface. Support for PK, VF, \
PostScript Type1, and TrueType fonts, colour specials, and \
inclusion of PostScript, PNG, JPEG or GIF images."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.18svn77830"

RPM_NAME = "texlive-dvipng-2026.226.1.18svn77830-61.4.noarch.rpm"
RPM_HASH = "ffdeb54ae9a444239c3b36ebdaca8fe9f9d0d85d7ef3bbd3c242725a10abb3057737770805d4490a0513942cdf76726f982397c30d1a41608778bd5737b94e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvigif.1 \
man-dvipng.1 \
texlive-dvipng"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvipng-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
