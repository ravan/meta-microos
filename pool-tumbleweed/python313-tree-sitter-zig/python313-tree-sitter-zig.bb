SUMMARY = "Python binding for the tree-sitter-zig grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-zig grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-tree-sitter-zig-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "a9b91f4c523789d5c4dbfbb7f3bee9029bcd29908957b3ad29458e6afb0f846b11c253a1af563bf68d34cbb1c5f8f7ca600490b1f30956e20140619c29c267d4"

RPROVIDES:${PN} += "python3-tree-sitter-zig \
python313-tree-sitter-zig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
