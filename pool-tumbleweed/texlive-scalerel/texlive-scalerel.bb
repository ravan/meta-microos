SUMMARY = "Constrained scaling and stretching of objects"
DESCRIPTION = "The package provides four commands for vertically scaling and \
stretching objects. Its primary function is the ability to \
scale/stretch and shift one object to conform to the size of a \
specified second object. This feature can be useful in both \
equations and schematic diagrams. Additionally, the scaling and \
stretching commands offer constraints on maximum width and/or \
minimum aspect ratio, which are often used to preserve \
legibility or for the sake of general appearance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-scalerel-2026.226.1.8svn77682-60.2.noarch.rpm"
RPM_HASH = "63b0def21aa7da40c88441815dc12ab7639919ae1b1d355abb6efe9f0ec0775bf49b95c7463426f8fb3d0abe87e440fb7fa63a5522b283301b48a7485e28a605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scalerel.sty \
texlive-scalerel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
