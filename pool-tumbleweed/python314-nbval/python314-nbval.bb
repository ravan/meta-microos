SUMMARY = "A pytest plugin to validate Jupyter notebooks"
DESCRIPTION = "The plugin adds functionality to py.test to recognise and collect \
Jupyter notebooks. The intended purpose of the tests is to determine \
whether execution of the stored inputs match the stored outputs of \
the .ipynb file. Whilst also ensuring that the notebooks are running \
without errors. \
 \
The tests were designed to ensure that Jupyter notebooks (especially \
those for reference and documentation), are executing consistently. \
 \
Each cell is taken as a test, a cell that doesn't reproduce the \
expected output will fail."
LICENSE = "BSD-3-Clause"

PV = "0.11.0"

RPM_NAME = "python314-nbval-0.11.0-3.4.noarch.rpm"
RPM_HASH = "4d2cbc67a314fe4dc7c91bd22389ab921f10e40034167070005af9052547bf74b67a47926e934287f2be8b4852a2cc0de1fa412f3d87f15480679911be8db4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nbval \
python314-jupyter-nbval \
python314-nbval \
python3dist-nbval"

RDEPENDS:${PN} += "python-abi \
python314-coverage \
python314-ipykernel \
python314-jupyter-client \
python314-nbformat \
python314-pytest"

inherit rpm
