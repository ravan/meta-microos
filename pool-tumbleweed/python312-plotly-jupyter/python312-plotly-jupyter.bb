SUMMARY = "Jupyter notebook integration for python312-plotly"
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

RPM_NAME = "python312-plotly-jupyter-5.22.0-3.2.noarch.rpm"
RPM_HASH = "ecbbbb784e5b8e137937f153927601a88d4bfa2e107afe094fa9c9a3185c932eb94b2d87293b39527d6b7afc8137ec22a7cd51fd8bcc3e98c55f7cb956f9ca88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyterpython-plotly-jupyter \
python312-jupyterlab-plotly \
python312-plotly-jupyter"

RDEPENDS:${PN} += "jupyter-plotly \
python-abi \
python312-ipywidgets \
python312-plotly"

inherit rpm
