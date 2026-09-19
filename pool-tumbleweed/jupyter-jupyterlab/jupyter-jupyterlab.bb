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

RPM_NAME = "jupyter-jupyterlab-4.5.10-1.1.noarch.rpm"
RPM_HASH = "3b210eb8ec579e49dfe0e226222f2978c71bcd7700c801e05e2e0be33578210c0ff044abe6294a2fab1893f71a0381d8e62335c0d7f12d72c16f565f83dc49cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab \
jupyter-jupyterlab-discovery"

RDEPENDS:${PN} += "jupyter-jupyterlab-filesystem \
nodejs \
npm \
python3dist-jupyterlab"

inherit rpm
