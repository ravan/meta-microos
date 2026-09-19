SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets - Jupyter JS files"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets - Jupyterlab-manager JS files"
LICENSE = "BSD-3-Clause"

PV = "3.0.15"

RPM_NAME = "jupyter-jupyterlab-widgets-3.0.15-1.7.noarch.rpm"
RPM_HASH = "d95168d507506658a85c2e3c5e6a2fb5a1d2b0a664bbb28ac79871109266b70b23a83355d269616d3af85039dc1fb4ee72495e58a04b1d2836634cc828ad2608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-widgets-jupyterlab-manager \
jupyter-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-filesystem \
python3dist-jupyterlab-widgets"

inherit rpm
