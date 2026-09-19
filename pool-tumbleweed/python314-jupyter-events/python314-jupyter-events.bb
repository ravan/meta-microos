SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python314-jupyter-events-0.12.1-1.1.noarch.rpm"
RPM_HASH = "7112b133dad94bb0d1554b9b21015cb882d2b64cbb5ebd91c28fbb5ee7cb0a73bbebc124de134eaf3c1f68333f24eb18aeb0fd57d60627e628eeff43dcb01051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-events \
python314-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-jsonschema-format-nongpl \
python314-packaging \
python314-python-json-logger \
python314-referencing \
python314-rfc3339-validator \
python314-rfc3986-validator \
python314-traitlets"

inherit rpm
