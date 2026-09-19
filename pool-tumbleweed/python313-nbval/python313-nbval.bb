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

RPM_NAME = "python313-nbval-0.11.0-3.4.noarch.rpm"
RPM_HASH = "51327dfa3a4db9e0a4d274047387dcf644810ea8c898c39f9d3f2dfc282fdb5c84ff88e3e1aa8fb1a964f8236f91ef8204a176ab37aeb9da9e22ff14979967fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbval \
python3-jupyter-nbval \
python3-nbval \
python3.13dist-nbval \
python313-jupyter-nbval \
python313-nbval \
python3dist-nbval"

RDEPENDS:${PN} += "python-abi \
python313-coverage \
python313-ipykernel \
python313-jupyter-client \
python313-nbformat \
python313-pytest"

inherit rpm
