SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.1.8"

RPM_NAME = "python313-ipywidgets-8.1.8-1.4.noarch.rpm"
RPM_HASH = "55d1a5f1371f9d5a07c7a57cd8779695c1dbaba75217a3dec4ea5f1a6f97b078350ee147ea346a15ab16d3c6f04f65319a0ae94f19b2bef777c3cd5fd6e09f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipywidgets \
python3-ipywidgets \
python3-jupyter-ipywidgets \
python3.13dist-ipywidgets \
python313-ipywidgets \
python313-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python313-jupyterlab-widgets >= 3.0.15 with python313-jupyterlab-widgets < 4 \
-python313-widgetsnbextension >= 4.0.14 with python313-widgetsnbextension < 5 \
python-abi \
python313-comm \
python313-ipython \
python313-traitlets"

inherit rpm
