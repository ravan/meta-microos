SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.28.0"

RPM_NAME = "python313-jupyterlab-server-2.28.0-2.4.noarch.rpm"
RPM_HASH = "33452de285c31c817dbefba230c661a684c39026b0ff4b2661c1c819ac788498738aa1a49a4629fb83a49db3f849381f00a46cce3fd0f91fc49032f00170185d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-launcher \
jupyter-jupyterlab-server \
python3-jupyter-jupyterlab-launcher \
python3-jupyter-jupyterlab-server \
python3-jupyterlab-server \
python3.13dist-jupyterlab-server \
python313-jupyter-jupyterlab-launcher \
python313-jupyter-jupyterlab-server \
python313-jupyterlab-server \
python3dist-jupyterlab-server"

RDEPENDS:${PN} += "-python313-jupyter-server >= 1.21 with python313-jupyter-server < 3 \
python-abi \
python313-Babel \
python313-Jinja2 \
python313-json5 \
python313-jsonschema \
python313-packaging \
python313-requests"

inherit rpm
