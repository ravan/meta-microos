SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.15"

RPM_NAME = "python313-jupyterlab-widgets-3.0.15-1.7.noarch.rpm"
RPM_HASH = "0589d449d41958e062e6e942829071d2d20f6819e18092dc7fb3e28a5528f85bc4952abee552f97601c74a2990348988d88ea715a8b5e5ece6432307dda5385b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-widgets \
python3.13dist-jupyterlab-widgets \
python313-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
