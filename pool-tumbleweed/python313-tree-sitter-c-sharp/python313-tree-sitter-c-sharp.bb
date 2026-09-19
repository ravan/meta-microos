SUMMARY = "Python binding for the tree-sitter-c-sharp grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-c-sharp grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "python313-tree-sitter-c-sharp-0.23.5-2.1.aarch64.rpm"
RPM_HASH = "5eec4e342f9f9f7986b84d186faa51df9d80c6d41d11b09aa28e0f94ebdd57c57f61987f9b14514922d51fdc7571b98d281ca042bb250dca9f939de9ce36527b"

RPROVIDES:${PN} += "python3-tree-sitter-c-sharp \
python313-tree-sitter-c-sharp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
