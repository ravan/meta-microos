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

RPM_NAME = "python314-Pweave-0.30.3-9.4.noarch.rpm"
RPM_HASH = "b8aae55d1efeded6ba2da705988da3d387bab627b166c3d0653b6f768ec020fe4dfe5ef4380c07e708d93c9790001248cb7ed1511810204fa98662a90dfe82a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pweave \
python314-Pweave \
python3dist-pweave"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Markdown \
python314-Pygments \
python314-ipykernel \
python314-ipython \
python314-jupyter-client \
python314-nbconvert \
python314-nbformat \
update-alternatives"

inherit rpm
