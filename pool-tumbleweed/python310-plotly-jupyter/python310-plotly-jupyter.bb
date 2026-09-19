SUMMARY = "Jupyter notebook integration for python310-plotly"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph. \
 \
This package provides Jupyterlab and Notebook integration and widgets."
LICENSE = "MIT"

PV = "5.22.0"

RPM_NAME = "python310-plotly-jupyter-5.22.0-3.2.noarch.rpm"
RPM_HASH = "cab2a8ca58b02e17d0ebf11baf1e425103c1b631e43a9db8f95d46ec4f5e3b914908f3a3a65ecb647bfb09085ac9d0b47b9db1ea88b5b87b84a7d6d6ca2f60af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyterpython-plotly-jupyter \
python310-jupyterlab-plotly \
python310-plotly-jupyter"

RDEPENDS:${PN} += "jupyter-plotly \
python-abi \
python310-ipywidgets \
python310-plotly"

inherit rpm
