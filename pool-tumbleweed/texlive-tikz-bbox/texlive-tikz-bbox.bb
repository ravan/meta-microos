SUMMARY = "Precise determination of bounding boxes in TikZ"
DESCRIPTION = "The built-in determination of the bounding box in TikZ is not \
entirely accurate. This is because, for Bezier curves, it is \
the smallest box that contains all control points, which is in \
general larger than the box that just contains the curve. This \
library determines the exact bounding box of the curve."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn57444"

RPM_NAME = "texlive-tikz-bbox-2026.227.0.0.1svn57444-62.2.noarch.rpm"
RPM_HASH = "df28dfe34217e3960979deb6481e9aaa67a519d1e4c03f7b0ebbff06832f84134992a93fc3b38ea1e5412fc5f38a682ba7ff84ff7b50eca916c41a01aa435417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibrarybbox.code.tex \
texlive-tikz-bbox"

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
