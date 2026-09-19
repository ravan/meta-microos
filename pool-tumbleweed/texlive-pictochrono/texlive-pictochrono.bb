SUMMARY = "Insert 'chronometer pictograms' with a duration"
DESCRIPTION = "Small package to insert, inline with automatic height and \
vertical offset, small 'pictogram chronometers' to indicate a \
duration."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn75622"

RPM_NAME = "texlive-pictochrono-2026.226.0.0.1.1svn75622-58.2.noarch.rpm"
RPM_HASH = "32386b438b75e2dc20e49fc1b358449009dccfd54ac79f663a7792ffea35bbf6a6f8cd606700b748ff6a46eb88ced416ddbfc6ea666bb898044d8f89d2ab4b9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pictochrono.sty \
texlive-pictochrono"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
