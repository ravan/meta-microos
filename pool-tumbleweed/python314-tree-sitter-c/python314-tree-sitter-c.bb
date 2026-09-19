SUMMARY = "Python binding for the tree-sitter-c grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-c grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.24.1"

RPM_NAME = "python314-tree-sitter-c-0.24.1-3.1.aarch64.rpm"
RPM_HASH = "c4ed46cfa257f0170748a32dbb157d358c11a02ec1e688967a1ef93f1c5014c4914278da8e18258d979ec549d1d0cb5cd1427280f502c49800e2d19a9e88be99"

RPROVIDES:${PN} += "python314-tree-sitter-c"

RDEPENDS:${PN} += "python-abi"

inherit rpm
