SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.11.0"

RPM_NAME = "python313-pytest-jupyter-0.11.0-1.5.noarch.rpm"
RPM_HASH = "5e2113a4416e7b8baf8b65739c5524bf8d9528cc6d39071debdcf0ab0739413b9d841d1f158f204ef03e9ba4fcfcace043bc79a5c137ac4310832de9bd023880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter \
python3.13dist-pytest-jupyter \
python313-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python313-jupyter-core \
python313-pytest"

inherit rpm
