SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.15"

RPM_NAME = "python314-jupyterlab-widgets-3.0.15-1.7.noarch.rpm"
RPM_HASH = "2266bbc0db5fef9de86a829a40ad61b01265e22276a399fcb9f85bd6eb367f03780c6fcbe8350cd608386d22bc96dd3be0f34423701017890b7cc77420997f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyterlab-widgets \
python314-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
