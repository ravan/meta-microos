SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.11.0"

RPM_NAME = "python313-pytest-jupyter-client-0.11.0-1.5.noarch.rpm"
RPM_HASH = "4776be114046faccd235fe0a219bd8d7aa8c8858ca9ddbe3fa1af1ea301394a86970578ed416fbd0539beca5a76b813330325e81745f83f4d5dc1ea696d22437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-client \
python313-pytest-jupyter-client"

RDEPENDS:${PN} += "python313-ipykernel \
python313-jupyter-client \
python313-nbformat \
python313-pytest-jupyter"

inherit rpm
