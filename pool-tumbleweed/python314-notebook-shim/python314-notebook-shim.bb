SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python314-notebook-shim-0.2.4-1.9.noarch.rpm"
RPM_HASH = "523977d9c5bd21db88462f91917081a060efac04f887429460723d03b691eac617410d54b7dd3c96c1f70655dc12e0993d0b4992e030bf033f59a3c2bc849605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-notebook-shim \
python314-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python314-jupyter-server >= 1.8 with python314-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
