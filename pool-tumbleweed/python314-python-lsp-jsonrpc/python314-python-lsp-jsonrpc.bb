SUMMARY = "JSON RPC 2.0 server library"
DESCRIPTION = "A Python 3.6+ server implementation of the JSON RPC 2.0 protocol. \
This library has been pulled out of the Python Language Server project."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-python-lsp-jsonrpc-1.1.2-2.12.noarch.rpm"
RPM_HASH = "69782bbf877957d26bdb269e359bf849bed490fed06d2b92236d98480183eed4d1cf2064cec1feec91e4f6a8988cd80f498ba988a2bab0403f13b0459cbe3cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-lsp-jsonrpc \
python314-python-lsp-jsonrpc \
python3dist-python-lsp-jsonrpc"

RDEPENDS:${PN} += "python-abi \
python314-ujson"

inherit rpm
