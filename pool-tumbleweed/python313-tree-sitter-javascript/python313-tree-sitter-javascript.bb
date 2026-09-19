SUMMARY = "Python binding for the tree-sitter-javascript grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-javascript grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python313-tree-sitter-javascript-0.23.1-4.1.aarch64.rpm"
RPM_HASH = "708ec9107a215c45125984a40333f77adb10a6b5e1d4537a91902cdec93f3616847a1c83e57d89a0ac345032f84abcc9c85fb3828553aa0fae43b044e9a76102"

RPROVIDES:${PN} += "python3-tree-sitter-javascript \
python313-tree-sitter-javascript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
