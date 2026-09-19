SUMMARY = "Spherical Mercator coordinate systems and Web Mercator tile integration"
DESCRIPTION = "This package extends TikZ with tools to create map graphics. \
The provided coordinate system relies on the Web Mercator \
projection used on the Web by OpenStreetMap and others. The \
package supports the seamless integration of graphics from \
public map tile servers by a Python script. Also, common map \
elements like markers, geodetic networks, bar scales, routes, \
orthodrome pieces, and more are part of the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.0svn77981"

RPM_NAME = "texlive-mercatormap-2026.226.1.3.0svn77981-61.2.noarch.rpm"
RPM_HASH = "f4e57d5422ac61293062d957fe432685edcf2f151d010443856a6a5967717220ce2ba7f098348e88ab6229df729ef76ced990008aa7ee5a194643c17410edc2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mercatormap.sty \
tex-mercatorpy.def \
tex-mercatorsupplier.def \
texlive-mercatormap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-siunitx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
