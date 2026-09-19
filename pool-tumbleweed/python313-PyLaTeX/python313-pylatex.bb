SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python313-PyLaTeX-1.4.2-2.5.noarch.rpm"
RPM_HASH = "dceecd244b79bb169fa7573815681243c7004b871e56bf9edd3e4f2bb79e0a31802aed74db5b4e078728f14f64de5401aa2b453dfb60c5ec528a95ff1bda4467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyLaTeX \
python3.13dist-pylatex \
python313-PyLaTeX \
python3dist-pylatex"

RDEPENDS:${PN} += "python-abi \
python313-ordered-set \
texlive-latex"

inherit rpm
