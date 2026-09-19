SUMMARY = "Python binding for the tree-sitter-go grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-go grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "python313-tree-sitter-go-0.23.4-3.1.aarch64.rpm"
RPM_HASH = "dfe2f2d4900f009f7248023138a9871857ddf41b052044bc28061c239035206020378c38d4a9663c3c68f51d25baafbbdc974a6efd5c6348c09ed62f91756dfa"

RPROVIDES:${PN} += "python3-tree-sitter-go \
python313-tree-sitter-go"

RDEPENDS:${PN} += "python-abi"

inherit rpm
