SUMMARY = "Black plugin for the Python LSP Server"
DESCRIPTION = "Black plugin for the Python LSP Server \
 \
To avoid unexpected results you should make sure yapf and autopep8 are not installed. \
 \
- pyls-black can either format an entire file or just the selected text. \
- The code will only be formatted if it is syntactically valid Python. \
- Text selections are treated as if they were a separate Python file. \
  Unfortunately this means you can't format an indented block of code. \
- python-lsp-black will use your project's pyproject.toml if it has one."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-python-lsp-black-2.0.0-3.9.noarch.rpm"
RPM_HASH = "e0ec7b0b4a9087ab6b8483273e93f1b7fcc1b205f46205f3506cd7b57e9e93666873fb41fea31d1bdaa920dea2b4349c0e74874e354759e289cef67e10ae4568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-lsp-black \
python314-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python314-black \
python314-python-lsp-server"

inherit rpm
