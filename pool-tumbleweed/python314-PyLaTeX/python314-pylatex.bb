SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python314-PyLaTeX-1.4.2-2.5.noarch.rpm"
RPM_HASH = "9b2443fdbcc3a38364fcc3ab73b633bb48ba281a46fe13b996014927970f7626075e0b70423d1cf93bb331449beaaa1c9c756f0f949feebde4a22e0046d01b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylatex \
python314-PyLaTeX \
python3dist-pylatex"

RDEPENDS:${PN} += "python-abi \
python314-ordered-set \
texlive-latex"

inherit rpm
