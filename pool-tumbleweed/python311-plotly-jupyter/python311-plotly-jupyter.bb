SUMMARY = "Jupyter notebook integration for python311-plotly"
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

RPM_NAME = "python311-plotly-jupyter-5.22.0-3.2.noarch.rpm"
RPM_HASH = "290ed8fe9e98e88d3f24ebdcfcc90ec3a57faac88638648806c53561e7190d8424bd49d27235740b35996af4f4b4e6446c6810acbe4bd6a0ffe67abe7da54914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyterpython-plotly-jupyter \
python3-jupyterlab-plotly \
python3-plotly-jupyter \
python311-jupyterlab-plotly \
python311-plotly-jupyter"

RDEPENDS:${PN} += "jupyter-plotly \
python-abi \
python311-ipywidgets \
python311-plotly"

inherit rpm
