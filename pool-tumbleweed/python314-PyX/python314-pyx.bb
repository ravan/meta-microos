SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.17"

RPM_NAME = "python314-PyX-0.17-1.3.noarch.rpm"
RPM_HASH = "1ef666ed48ac93789440bac2113cf700ba431bafc74c7f806e91d1a64b46313f8aa6b439fd6d5788a6dd37da459e62f681e82c6e7a2977e65d5341adced0da2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyx \
python314-PyX \
python314-pyx \
python3dist-pyx"

RDEPENDS:${PN} += "python-abi \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
