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

RPM_NAME = "python313-python-lsp-black-2.0.0-3.9.noarch.rpm"
RPM_HASH = "3dd27309d8a71ceae6485127002a93a2099bcc0fe9d4007b182f43e078e9c0e6137b2c7ef323a9cd958ee55c0853ff80cc9439d0912d28fbf275d7120fe58baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-black \
python3.13dist-python-lsp-black \
python313-python-lsp-black \
python3dist-python-lsp-black"

RDEPENDS:${PN} += "python-abi \
python313-black \
python313-python-lsp-server"

inherit rpm
