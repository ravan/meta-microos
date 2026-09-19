SUMMARY = "Ruff linting plugin for pylsp"
DESCRIPTION = "python-lsp-ruff is a plugin for python-lsp-server that adds linting, \
code actions and formatting capabilities that are provided by ruff"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python313-python-lsp-ruff-2.3.1-2.1.noarch.rpm"
RPM_HASH = "0457ba592f7604ac01fb4e8ca6b5c693c2dd8beca8340b17863756cf2c927f7cd5045a2c8da94ac4dbad2123227cca50c04b84404380aa7db1b3adf6c1f7ed60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-ruff \
python3.13dist-python-lsp-ruff \
python313-python-lsp-ruff \
python3dist-python-lsp-ruff"

RDEPENDS:${PN} += "python-abi \
python313-cattrs \
python313-lsprotocol \
python313-python-lsp-server \
python313-ruff"

inherit rpm
