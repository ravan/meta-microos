SUMMARY = "LSP for Jupyter Notebook/Lab server"
DESCRIPTION = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"

PV = "2.2.6"

RPM_NAME = "python313-jupyter-lsp-2.2.6-3.4.noarch.rpm"
RPM_HASH = "642399f1cf58b9ac0302b59dc50dc340e973c8d785f9b9bbef97267470ef54db14193e7e4685a578f0f02bb8316ce522a835d1b1bc033328dc38db48acfafc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-lsp \
python3.13dist-jupyter-lsp \
python313-jupyter-lsp \
python3dist-jupyter-lsp"

RDEPENDS:${PN} += "jupyter-lsp \
python-abi \
python313-jupyter-server"

inherit rpm
