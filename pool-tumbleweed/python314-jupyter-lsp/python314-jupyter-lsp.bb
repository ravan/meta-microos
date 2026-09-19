SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.6"

RPM_NAME = "python314-jupyter-lsp-2.2.6-3.4.noarch.rpm"
RPM_HASH = "535a362ef0c2fc6f3bf53e87d619766ffa854c36a94745eaf2d1a4b65aaf8755cd235f93c4b7608e6c11570d4bfa8cba6d5aad9bb7a62c53b9766af9fa347983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-lsp \
python314-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python314-jupyter-server"

inherit rpm
