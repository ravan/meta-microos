SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "4.5.10"

RPM_NAME = "python313-jupyterlab-4.5.10-1.1.noarch.rpm"
RPM_HASH = "701077e40bed4dbcb6ef59cc048d9ee4ea379dfc8be0a16c74f142c51648158b6341c66ed2f8e97a78a8c5f7aeb80e60412abd22416b7916f74c8b0fc809d1e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-jupyterlab \
python3-jupyterlab \
python3.13dist-jupyterlab \
python313-jupyter-jupyterlab \
python313-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python313-httpx >= 0.25.0 with python313-httpx < 1.0 \
-python313-jupyter-server >= 2.4.0 with python313-jupyter-server < 3 \
-python313-jupyterlab-server >= 2.28.0 with python313-jupyterlab-server < 3 \
/usr/bin/node \
/usr/bin/python3.13 \
/usr/bin/sh \
jupyter-jupyterlab \
python-abi \
python313-Jinja2 \
python313-async-lru \
python313-ipykernel \
python313-jupyter-core \
python313-jupyter-lsp \
python313-notebook-shim \
python313-packaging \
python313-setuptools \
python313-tornado \
python313-traitlets \
update-alternatives"

inherit rpm
