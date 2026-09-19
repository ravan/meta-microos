SUMMARY = "Rewrite labels in EPS graphics"
DESCRIPTION = "A macro package for use with epsf.tex which allows PostScript \
labels in an Encapsulated PostScript file to be replaced by TeX \
labels. The package provides commands \\relabel (simply replace \
a PostScript string), \\adjustrelabel (replace a PostScript \
string, with position adjustment), and \\extralabel (add a label \
at given coordinates). You can, if you so choose, use the \
facilities of the labelfig package in place of using \
\\extralabel."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19082"

RPM_NAME = "texlive-rlepsf-2026.226.svn19082-60.4.noarch.rpm"
RPM_HASH = "294ca33db5e3284c6fc5c31dd42808b152aea2d1d5b5ebdf056b444c63c371203ac5b5625bfd7e35320ed459a74432fccf648a2520f4d29ca86de8ec196073d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rlepsf.tex \
texlive-rlepsf"

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
