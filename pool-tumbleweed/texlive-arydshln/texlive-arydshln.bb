SUMMARY = "Draw dash-lines in array/tabular"
DESCRIPTION = "The package is to draw dash-lines in array/tabular \
environments. Horizontal lines are drawn by \\hdashline and \
\\cdashline while vertical ones can be specified as a part of \
the preamble using ':'. The shape of dash-lines may be \
controlled through style parameters or optional arguments. The \
package is compatible with array, colortab, longtable, and \
colortbl."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.76svn77682"

RPM_NAME = "texlive-arydshln-2026.226.1.76svn77682-60.2.noarch.rpm"
RPM_HASH = "86c0a41fce1cc5317bf1241907b63ecaccc5d5f1cd28db63b95827a125b6f6d3cbfbf7fb94509a900fadfae7787dd6168ae0bfe4b093c35db3d0fd7a901cbdcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arydshln.sty \
texlive-arydshln"

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
