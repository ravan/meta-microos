SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-python-lsp-jsonrpc-1.1.2-2.12.noarch.rpm"
RPM_HASH = "96a17c84daa3a1e00f0b1757dcedb7a3db504aba1283ef722a6bd04b5f39176a54ec683db1311d73cc60136ed3000e9c13f3a1c40e30b9fd604af4e771ac9b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-lsp-jsonrpc \
python3.13dist-python-lsp-jsonrpc \
python313-python-lsp-jsonrpc \
python3dist-python-lsp-jsonrpc"

RDEPENDS:${PN} += "python-abi \
python313-ujson"

inherit rpm
