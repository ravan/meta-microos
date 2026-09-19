SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.28.0"

RPM_NAME = "python314-jupyterlab-server-2.28.0-2.4.noarch.rpm"
RPM_HASH = "5d29ed4ce8c645a97e40b69b914d3838d9ce8d39205fa73fe34ea471f6957c240e53d67667b22e3dfd1387372026d40b4312113cfdbfa6799b61cb4446099776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyterlab-server \
python314-jupyter-jupyterlab-launcher \
python314-jupyter-jupyterlab-server \
python314-jupyterlab-server \
python3dist-jupyterlab-server"

RDEPENDS:${PN} += "-python314-jupyter-server >= 1.21 with python314-jupyter-server < 3 \
python-abi \
python314-Babel \
python314-Jinja2 \
python314-json5 \
python314-jsonschema \
python314-packaging \
python314-requests"

inherit rpm
