SUMMARY = "An Adobe Type 1 format version of the bbold font"
DESCRIPTION = "The files offer an Adobe Type 1 format version of the 5pt, 7pt \
and 10pt versions of the bbold fonts. The distribution also \
includes a map file, for use when incorporating the fonts into \
TeX documents; the macros provided with the original Metafont \
version of the font serve for the scaleable version, too. The \
fonts were produced to be part of the TeX distribution from \
Y&Y; they were generously donated to the TeX Users Group when \
Y&Y closed its doors as a business."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn33143"

RPM_NAME = "texlive-bbold-type1-2026.226.svn33143-61.2.noarch.rpm"
RPM_HASH = "aebb1b0ee0f9e3d74117d3de3c68fc5e2ac9544bef822e2a0797230b97ff48d32a162de543113e8f0be1c17dc714db77033749e21d15a4e81bb5b52e679c4b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbold.map \
texlive-bbold-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-bbold-type1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
