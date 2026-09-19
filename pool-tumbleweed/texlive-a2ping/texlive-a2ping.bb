SUMMARY = "Advanced PS, PDF, EPS converter"
DESCRIPTION = "a2ping is a Perl script command line utility written for Unix \
that converts many raster image and vector graphics formats to \
EPS or PDF and other page description formats. Accepted input \
file formats are: PS (PostScript), EPS, PDF, PNG, JPEG, TIFF, \
PNM, BMP, GIF, LBM, XPM, PCX, TGA. Accepted output formats are: \
EPS, PCL5, PDF, PDF1, PBM, PGM, PPM, PS, markedEPS, markedPS, \
PNG, XWD, BMP, TIFF, JPEG, GIF, XPM. a2ping delegates the \
low-level work to Ghostscript (GS), pdftops and sam2p. a2ping \
fixes many glitches during the EPS to EPS conversion, so its \
output is often more compatible and better embeddable than its \
input."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.84psvn52964"

RPM_NAME = "texlive-a2ping-2026.226.2.84psvn52964-61.2.noarch.rpm"
RPM_HASH = "d86902d3bbeca8aedec465d68d90d53ae7770f2af81be6594b9db142cc0d9ce80b20aa1eb493c9996f671378d73f04d6821fc40c55e634f87e40d78728c45162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a2ping"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-a2ping-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
