SUMMARY = "Python binding for the tree-sitter-json grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-json grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.24.8"

RPM_NAME = "python314-tree-sitter-json-0.24.8-3.1.aarch64.rpm"
RPM_HASH = "118591ed4a46724e8b1d923ff2d3d6784bab9cee840f9d40ab1a8d533935e32ae52468888093d638eab77f6442903404ebbb68b6ee9f47f49b78258f66d0133c"

RPROVIDES:${PN} += "python314-tree-sitter-json"

RDEPENDS:${PN} += "python-abi"

inherit rpm
