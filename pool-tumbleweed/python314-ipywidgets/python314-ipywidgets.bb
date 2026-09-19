SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.1.8"

RPM_NAME = "python314-ipywidgets-8.1.8-1.4.noarch.rpm"
RPM_HASH = "872b71c87fa5286fb28b7b9fb8cca7fb805045a8b2c00977dd0deed1436f47baaf7c1439d1d4e4c368d947a90f44a7722cac42636aa74be8c073990bdc7c9163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipywidgets \
python314-ipywidgets \
python314-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python314-jupyterlab-widgets >= 3.0.15 with python314-jupyterlab-widgets < 4 \
-python314-widgetsnbextension >= 4.0.14 with python314-widgetsnbextension < 5 \
python-abi \
python314-comm \
python314-ipython \
python314-traitlets"

inherit rpm
