SUMMARY = "Ruff linting plugin for pylsp"
DESCRIPTION = "python-lsp-ruff is a plugin for python-lsp-server that adds linting, \
code actions and formatting capabilities that are provided by ruff"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python314-python-lsp-ruff-2.3.1-2.1.noarch.rpm"
RPM_HASH = "6f56321813423df80d53162a7ffe9d06fb61dec40f079875619ab46fc1e254a7929738ec6044b5bc843db58609b15b43d2d5e599f868412b3e331ef79c8f45b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-lsp-ruff \
python314-python-lsp-ruff \
python3dist-python-lsp-ruff"

RDEPENDS:${PN} += "python-abi \
python314-cattrs \
python314-lsprotocol \
python314-python-lsp-server \
python314-ruff"

inherit rpm
