SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.11.0"

RPM_NAME = "python313-pytest-jupyter-server-0.11.0-1.5.noarch.rpm"
RPM_HASH = "35ed7539e3b9e9f4419ff210f87400ce33dbbd7204fb2ace86e1b59acc25c6efac09878aa4a6cf36366cbf013a19cf070476644fca2c923535ddad95ed15e321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-server \
python313-pytest-jupyter-server"

RDEPENDS:${PN} += "python313-ipykernel \
python313-jupyter-client \
python313-jupyter-server \
python313-nbformat \
python313-pytest-jupyter"

inherit rpm
