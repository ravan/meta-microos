SUMMARY = "LSP for Jupyter Notebook/Lab server - Config"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server \
Jupyter config"
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "jupyter-lsp-5.2.0-3.4.noarch.rpm"
RPM_HASH = "b0bfb0e4e4cf84bf0bfe22e824399d8be3f962af6d667aed02776c934914b45d5acece2bdc8922e123910235d902077383f13efe642c09eca5712358b40cfad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-lsp"

RDEPENDS:${PN} += "python3dist-jupyter-lsp"

inherit rpm
