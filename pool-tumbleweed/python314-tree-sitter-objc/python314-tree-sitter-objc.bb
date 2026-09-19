SUMMARY = "Python binding for the objc tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_objc that loads the grammar library \
shipped in tree-sitter-objc and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python314-tree-sitter-objc-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "9cad3cf9f6042af3f51d28d419f9e1a8467c8466f072489333c7ecf4f3c77d12431885451c06459aae38f948896da29abbc81a3e3e23b677d2fef3ba6d28e40f"

RPROVIDES:${PN} += "python314-tree-sitter-objc"

RDEPENDS:${PN} += "python-abi \
tree-sitter-objc"

inherit rpm
