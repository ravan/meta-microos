SUMMARY = "Jupyter extension providing collaboration"
DESCRIPTION = "JupyterLab/Jupyter Notebook 7+ extension providing user interface integration \
for real time collaboration."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python314-jupyter-collaboration-ui-2.4.0-1.2.noarch.rpm"
RPM_HASH = "74d0677706409d4728ca7912d27112167843eca4e4bac8cab58a02440bc8a0d4f7fb5c9c6b9ba3a6646b3d5f2b6b61e0dec10e3279717d4f1f0b3005c86bd53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-collaboration-ui \
python314-jupyter-collaboration-ui \
python3dist-jupyter-collaboration-ui"

RDEPENDS:${PN} += "jupyter-collaboration-ui \
python-abi"

inherit rpm
