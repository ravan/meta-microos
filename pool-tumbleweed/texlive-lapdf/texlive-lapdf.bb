SUMMARY = "PDF drawing directly in TeX documents"
DESCRIPTION = "The package provides the means to use PDF drawing primitives to \
produce high quality, colored graphics. It uses Bezier curves \
(integral and rational) from degree one to seven, allows TeX \
typesetting in the graphic, offers most of the standard math \
functions, allows plotting normal, parametric and polar \
functions. The package has linear, logx, logy, logxy and polar \
grids with many specs; it can rotate, clip and do many nice \
things easily it has two looping commands for programming and \
many instructive example files. The package requires pdfTeX but \
otherwise only depends on the calc package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn23806"

RPM_NAME = "texlive-lapdf-2026.226.1.1svn23806-63.2.noarch.rpm"
RPM_HASH = "276d78d9768c69945beb0e52a3ccfb2306e1ab4c0b7d5241306d758f64b80ecaf64ffe05c16f8c84f9a21b7d45a21e93942e81a3b04a6649bfb7f3f11cea7866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lapdf.sty \
texlive-lapdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
