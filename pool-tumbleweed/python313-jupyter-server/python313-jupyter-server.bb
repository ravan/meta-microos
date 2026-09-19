SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.20.0"

RPM_NAME = "python313-jupyter-server-2.20.0-1.3.noarch.rpm"
RPM_HASH = "8d3dcd5a753884181d0f5c75a4d663f69d64eaca11b33423cf28d13ad28791b41858ad16cd53f0784371f253fba902723c860ab8c7c0eb1e83d4b7396a407ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-server \
python3-jupyter-server \
python3.13dist-jupyter-server \
python313-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-Jinja2 \
python313-Send2Trash \
python313-anyio \
python313-argon2-cffi \
python313-jupyter-client \
python313-jupyter-events \
python313-jupyter-server-terminals \
python313-nbconvert \
python313-nbformat \
python313-overrides \
python313-packaging \
python313-prometheus-client \
python313-pyzmq \
python313-terminado \
python313-tornado \
python313-traitlets \
python313-websocket-client"

inherit rpm
