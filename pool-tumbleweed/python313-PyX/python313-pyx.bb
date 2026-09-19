SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.17"

RPM_NAME = "python313-PyX-0.17-1.3.noarch.rpm"
RPM_HASH = "bcbfdf3a2d1c17e873b86ad6a69dbb64d3132ea82300d198e9f2963a581e0b37fd5c18311d73820f7b64532d5386af86a59aaeb3800cf0696e1b28d2aaa6af4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyX \
python3-pyx \
python3.13dist-pyx \
python313-PyX \
python313-pyx \
python3dist-pyx"

RDEPENDS:${PN} += "python-abi \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
