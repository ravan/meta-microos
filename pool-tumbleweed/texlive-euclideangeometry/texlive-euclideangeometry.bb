SUMMARY = "Draw geometrical constructions"
DESCRIPTION = "This package provides tools to draw most of the geometrical \
constructions that a high school instructor or bachelor degree \
professor might need to teach geometry. The connection to \
Euclide depends on the fact that in his times calculations were \
made with ruler, compass and also with ellipsograph. This \
package extends the functionalities of the curve2e package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn67608"

RPM_NAME = "texlive-euclideangeometry-2026.226.0.0.2.2svn67608-59.2.noarch.rpm"
RPM_HASH = "847be6f890970c660d938a193cd9ea8133ad16adf81803703a3b313ae39bd279cc3e4303fde7832d73ef6f60d0f5b23e5ccd565822b50eac79a387e9c922090a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euclideangeometry.sty \
texlive-euclideangeometry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-curve2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
