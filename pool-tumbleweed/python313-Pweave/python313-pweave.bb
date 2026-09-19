SUMMARY = "Scientific reports with embedded python computations"
DESCRIPTION = "Pweave is a scientific report generator and a literate programming \
tool for Python. Pweave can capture the results and plots from data \
analysis and works well with NumPy, SciPy and matplotlib. It is able \
to run python code from source document and include the results and \
capture matplotlib plots in the output. \
 \
Pweave is good for creating reports, tutorials, presentations etc. \
with embedded python code It can also be used to make websites together \
with e.g. Sphinx or rest2web."
LICENSE = "BSD-3-Clause"

PV = "0.30.3"

RPM_NAME = "python313-Pweave-0.30.3-9.4.noarch.rpm"
RPM_HASH = "9b289dd78d425a00b3e2103d11746487f2a835e830bc183bd4144f9a79d0bde4a51744f4054aed3a6cc1f69611c746d52559d044f7ba25b7076d28d0d4eca450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pweave \
python3.13dist-pweave \
python313-Pweave \
python3dist-pweave"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Markdown \
python313-Pygments \
python313-ipykernel \
python313-ipython \
python313-jupyter-client \
python313-nbconvert \
python313-nbformat \
update-alternatives"

inherit rpm
