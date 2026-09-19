SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python313-notebook-shim-0.2.4-1.9.noarch.rpm"
RPM_HASH = "57b8f5e1e54240d38cf9240e2ba9fb8e37374247437000fb152effff1971f5453565be2387b9706cdacb29e15aa105a932a387a57c1e009d2be1211fe5f1aa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notebook-shim \
python3.13dist-notebook-shim \
python313-notebook-shim \
python3dist-notebook-shim"

RDEPENDS:${PN} += "-python313-jupyter-server >= 1.8 with python313-jupyter-server < 3 \
jupyter-notebook-shim \
python-abi"

inherit rpm
