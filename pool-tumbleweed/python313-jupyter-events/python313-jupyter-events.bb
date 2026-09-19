SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python313-jupyter-events-0.12.1-1.1.noarch.rpm"
RPM_HASH = "6a00f1955f009593c21084cbdaf03c402c1f12057f23eba45e2f5ba6867831c1d12ac8c119862e5fc17e1ffbabca8da61b230b9ac13a4d92e4c1162b35c0eab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-events \
python3.13dist-jupyter-events \
python313-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-jsonschema-format-nongpl \
python313-packaging \
python313-python-json-logger \
python313-referencing \
python313-rfc3339-validator \
python313-rfc3986-validator \
python313-traitlets"

inherit rpm
