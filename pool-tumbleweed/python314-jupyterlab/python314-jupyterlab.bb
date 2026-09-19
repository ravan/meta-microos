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

RPM_NAME = "python314-jupyterlab-4.5.10-1.1.noarch.rpm"
RPM_HASH = "3665e6d8a2cb9b88be6aef74c486e67f3096b556751884d455c10ad1978a430225294bde5733d0a7211b362d77cfdb50909a1cdbe422be7a5a63f2548676f691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyterlab \
python314-jupyter-jupyterlab \
python314-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python314-httpx >= 0.25.0 with python314-httpx < 1.0 \
-python314-jupyter-server >= 2.4.0 with python314-jupyter-server < 3 \
-python314-jupyterlab-server >= 2.28.0 with python314-jupyterlab-server < 3 \
/usr/bin/node \
/usr/bin/python3.14 \
/usr/bin/sh \
jupyter-jupyterlab \
python-abi \
python314-Jinja2 \
python314-async-lru \
python314-ipykernel \
python314-jupyter-core \
python314-jupyter-lsp \
python314-notebook-shim \
python314-packaging \
python314-setuptools \
python314-tornado \
python314-traitlets \
update-alternatives"

inherit rpm
