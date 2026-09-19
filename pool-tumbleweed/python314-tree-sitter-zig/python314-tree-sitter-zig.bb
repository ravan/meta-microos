SUMMARY = "Python binding for the tree-sitter-zig grammar"
DESCRIPTION = "The tree_sitter_* Python module for the tree-sitter-zig grammar, loadable \
with the Language()/Parser() API from python-tree-sitter."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python314-tree-sitter-zig-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "b3bab0f4ea688389d91c4b03d32e9d5fdd3822a8b98c10af9029f74cf05a4e04e58dc74d5e3a0cf702b9110148c83b9c745f0136e4f63955f6ec142e37ec992c"

RPROVIDES:${PN} += "python314-tree-sitter-zig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
