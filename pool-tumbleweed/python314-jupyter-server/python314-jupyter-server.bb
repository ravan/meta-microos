SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.20.0"

RPM_NAME = "python314-jupyter-server-2.20.0-1.3.noarch.rpm"
RPM_HASH = "2e1f7624f217a6273329bfd97b8ffacec0b8ff2162baa082f786db2252a09b10f448b58cee9dc8b0657e457ef841e3c8037bfcd9344a65ea3877424d91ab038d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-server \
python314-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-Jinja2 \
python314-Send2Trash \
python314-anyio \
python314-argon2-cffi \
python314-jupyter-client \
python314-jupyter-events \
python314-jupyter-server-terminals \
python314-nbconvert \
python314-nbformat \
python314-overrides \
python314-packaging \
python314-prometheus-client \
python314-pyzmq \
python314-terminado \
python314-tornado \
python314-traitlets \
python314-websocket-client"

inherit rpm
